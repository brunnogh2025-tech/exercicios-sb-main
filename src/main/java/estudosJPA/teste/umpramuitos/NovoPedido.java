package estudosJPA.teste.umpramuitos;

import estudosJPA.infra.DAO;
import estudosJPA.modelo.basico.Produto;
import estudosJPA.modelo.umpramuitos.ItemPedido;
import estudosJPA.modelo.umpramuitos.Pedido;

public class NovoPedido {
    public static void main(String[] args) {

        DAO<Pedido> daoPedido = new DAO<>(Pedido.class);
        Pedido pedido = new Pedido();
        Produto produto = new Produto("Geladeira",2789.99);

        ItemPedido itemPedido = new ItemPedido(pedido,produto,10);

        daoPedido
                .incluirAtomico(pedido)
                .fechar();


    }
}
