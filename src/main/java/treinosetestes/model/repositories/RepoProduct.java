package treinosetestes.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import treinosetestes.model.entities.Product;

public interface RepoProduct extends CrudRepository<Product, Long>, PagingAndSortingRepository<Product, Long> {
    public Iterable<Product> findByNomeContaining(String parteNome);
}
