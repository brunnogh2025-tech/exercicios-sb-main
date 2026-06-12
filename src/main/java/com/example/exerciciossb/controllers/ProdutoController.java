package com.example.exerciciossb.controllers;

import com.example.exerciciossb.models.entities.Produto;
import com.example.exerciciossb.models.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody Produto novoProduto(@Valid Produto produto){
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProduto(){
        return produtoRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id){
        return produtoRepository.findById(id);
    }

    @GetMapping(path = "/pagina/{numeroPagina}/{qtdePagina}")
    public Iterable<Produto> obterProdutoPorPagina(@PathVariable int numeroPagina,@PathVariable int qtdePagina){
        if (qtdePagina >= 5) qtdePagina = 5;
        Pageable pageable = PageRequest.of(numeroPagina,qtdePagina);
        return produtoRepository.findAll(pageable);
    }
    @GetMapping(path = "/nome/{parteNome}")
    public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome){
        return produtoRepository.findByNomeContaining(parteNome);
    }
    @PutMapping
    public Produto alterarProduto(@Valid Produto produto, @PathVariable int id){
        produto.setId(id);
        produtoRepository.save(produto);
        return produto;
    }

    @DeleteMapping
    public void excluirProduto(@PathVariable int id){
        produtoRepository.deleteById(id);
    }

}
