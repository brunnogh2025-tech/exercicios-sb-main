package estudosJPA.modelo.umpramuitos;

import estudosJPA.modelo.basico.Entidade;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

public class Pedido implements Entidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date data;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.PERSIST)
    private List<ItemPedido> itens;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public Pedido(Date data, List<ItemPedido> itens) {
        this.data = data;
        this.itens = itens;
    }

    public Pedido() {

    }
}
