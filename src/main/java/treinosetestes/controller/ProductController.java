package treinosetestes.controller;


import com.example.exerciciossb.models.entities.Produto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import treinosetestes.model.entities.Product;
import treinosetestes.model.repositories.RepoProduct;

import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private RepoProduct repoProduct;

    @GetMapping
    public @ResponseBody Iterable<Product> getProduct(){
        return repoProduct.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Optional<Product> getProductById(@PathVariable Long id){
        return repoProduct.findById(id);
    }

    @GetMapping("/paging/{numeroPagina}/{quantPagina}")
    public Iterable<Product> getProductsByPage(@PathVariable int numeroPagina,@PathVariable int quantPagina){
        Pageable pageable = PageRequest.of(numeroPagina,quantPagina);
        return repoProduct.findAll(pageable);
    }
    @GetMapping("/nome/{parteNome}")
    public Iterable<Product> obterProdutosPorNome(@PathVariable String parteNome){
        return repoProduct.findByNomeContaining(parteNome);
    }

    @PostMapping
    public @ResponseBody Product saveProduct(@RequestBody @Valid Product product){
        return repoProduct.save(product);
    }

    @PutMapping("/{id}")
    public @ResponseBody Product updateProduct(@PathVariable Long id,@RequestBody @Valid Product product){
        product.setId(id);
        return repoProduct.save(product);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody Optional<Product> deleteProduct(@PathVariable Long id){
        Optional<Product> product = repoProduct.findById(id);
        repoProduct.deleteById(id);
        return product;
    }
}
