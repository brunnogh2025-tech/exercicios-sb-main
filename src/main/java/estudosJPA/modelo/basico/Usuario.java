package estudosJPA.modelo.basico;


import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;


@Entity
public class Usuario {

    @Id
    private Long id;

    @Column(name = "nome",nullable = false)
    private String nome;

    @Transient
    private String email;

    public Usuario() {
    }

    public Usuario(String email, String nome) {
        this.email = email;
        this.nome = nome;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
