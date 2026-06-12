package estudosJPA.infra;

import estudosJPA.modelo.basico.Entidade;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class DAO<E extends Entidade> {
    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> classe;

    static {
        try{
            emf = Persistence.createEntityManagerFactory("");
        } catch (Exception e){
            throw e;
        }
    }
    public DAO(){
        this(null);
    }
    public DAO(Class<E> classe){
        this.classe = classe;
        em = emf.createEntityManager();
    }
    public DAO<E> teste(){
        return this;
    }

    public DAO<E> abrirT(){
        em.getTransaction().begin();
        return this;
    }

    public DAO<E> fecharT(){
        em.getTransaction().commit();
        return this;
    }

    public DAO<E> incluir(E entidade){
        em.persist(entidade);
        return this;
    }

    public DAO<E> incluirAtomico(E entidade){
        return this.abrirT().incluir(entidade).fecharT();
    }

    public List<E> obterTodos(int qtde, int deslocamento){
        if (classe == null){
            throw new UnsupportedOperationException("Classe nula.");
        }
        String sql = "select e from " + classe.getName() +" e";
        TypedQuery<E> query = em.createQuery(sql, classe);
        query.setMaxResults(qtde);
        query.setFirstResult(deslocamento);
        return query.getResultList();
    }
    public E obterPorId(Long id){
        return em.find(classe, id);
    }
    public void fechar(){
        em.close();
        emf.close();
    }
}
