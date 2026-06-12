package estudosJPA.modelo.umpraum;

import estudosJPA.modelo.basico.Entidade;
import jakarta.persistence.*;

@Entity
@Table(name = "assentos")
public class Assento implements Entidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(mappedBy = "assento")
    private Cliente cliente;

    public Assento(String nome, Cliente cliente) {
        super();
        this.nome = nome;
        this.cliente = cliente;
    }
    public Assento(){

    }

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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
