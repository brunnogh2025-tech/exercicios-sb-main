package estudosJPA.teste.basico;

import estudosJPA.infra.DAO;
import estudosJPA.modelo.basico.Produto;

public class NovoProduto {
    public static void main(String[] args) {
        DAO<Produto> produtoDAO = new DAO<Produto>();
        Produto produto = new Produto("Notebook",1234.56);
        produtoDAO.incluirAtomico(produto).fechar();
    }
}
