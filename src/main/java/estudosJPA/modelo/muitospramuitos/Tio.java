package estudosJPA.modelo.muitospramuitos;

import estudosJPA.modelo.basico.Entidade;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Tio implements Entidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Sobrinho> sobrinhos = new ArrayList<>();

    public Tio(String nome) {
        this.nome = nome;
    }

    public Tio() {

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

    public List<Sobrinho> getSobrinhos() {
        return sobrinhos;
    }

    public void setSobrinhos(List<Sobrinho> sobrinhos) {
        this.sobrinhos = sobrinhos;
    }
}
