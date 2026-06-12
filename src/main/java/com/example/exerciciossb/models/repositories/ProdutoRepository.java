package com.example.exerciciossb.models.repositories;

import com.example.exerciciossb.models.entities.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>, CrudRepository<Produto,Integer> {
    public Iterable<Produto> findByNomeContaining(String parteNome);

}
