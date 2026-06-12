package estudosJPA.infra;

import estudosJPA.modelo.basico.Produto;

public class ProdutoDAO extends DAO<Produto> {
    public ProdutoDAO(){
        super(Produto.class);
    }
}
