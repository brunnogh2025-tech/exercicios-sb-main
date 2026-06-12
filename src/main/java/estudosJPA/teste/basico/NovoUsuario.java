package estudosJPA.teste.basico;

import estudosJPA.modelo.basico.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class NovoUsuario {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = new Usuario("seila@lanche.com","Pessoa da Silva");
        em.persist(usuario);

        em.close();
        emf.close();
    }
}
