package estudosJPA.teste.basico;

import estudosJPA.infra.DAO;
import estudosJPA.infra.ProdutoDAO;
import estudosJPA.modelo.basico.Produto;

import java.util.List;
import java.util.stream.Stream;

public class ObterProdutos {
    public static void main(String[] args) {

        ProdutoDAO produtoDAO = new ProdutoDAO();
        List<Produto> produtos = produtoDAO.obterTodos(6,1);
        for(Produto produto : produtos){
            System.out.println("ID: " + produto.getId() + "Nome: " + produto.getNome());
        }


    }
}
