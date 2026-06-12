package estudosJPA.teste.basico;

import estudosJPA.modelo.basico.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class AcharUsuarios {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("");
        EntityManager em = emf.createEntityManager();

        String sql = "SELECT u FROM Usuario";
        Query emq = em.createNamedQuery(sql, Usuario.class);
        emq.setMaxResults(5);

        List<Usuario> usuarios = emq.getResultList();

        System.out.println(usuarios);

        em.close();
        emf.close();
    }


}
