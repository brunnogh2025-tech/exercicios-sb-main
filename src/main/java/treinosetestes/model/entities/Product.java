package treinosetestes.model.entities;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

import java.time.LocalDate;

@Entity
@Valid
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Min(0)
    @Column(scale = 2)
    private double preco;

    @Min(0)
    @Max(100)
    @Column(scale = 2)
    private double desconto;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataValidacao;

    public String marca;

    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() { return marca; }

    public void setMarca(String marca) { this.marca = marca; }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public LocalDate getDataValidacao() { return dataValidacao; }

    public void setDataValidacao(LocalDate dataValidacao) { this.dataValidacao = dataValidacao; }

    @Column(scale = 2)
    public double getPrecoComDesconto() {
        return preco - preco * desconto / 100;
    }

    public Product(String nome, String marca, LocalDate dataValidacao, double desconto, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.dataValidacao = dataValidacao;
        this.desconto = desconto;
        this.preco = preco;
    }

    public Product() {
    }
}
