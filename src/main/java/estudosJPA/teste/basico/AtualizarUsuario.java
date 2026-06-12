package estudosJPA.teste.basico;

import estudosJPA.modelo.basico.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AtualizarUsuario {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = em.find(Usuario.class,1L);
        usuario.setEmail("seila2@gmail.com");

        em.getTransaction().begin();
        em.merge(usuario);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
