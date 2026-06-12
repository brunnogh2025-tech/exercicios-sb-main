package estudosJPA.teste.umpraum;

import estudosJPA.infra.DAO;
import estudosJPA.modelo.umpraum.Assento;
import estudosJPA.modelo.umpraum.Cliente;

public class ObterClienteAssento {
    public static void main(String[] args) {
        DAO<Cliente> daoCliente = new DAO<>(Cliente.class);

        Cliente cliente = daoCliente.obterPorId(1L);
        System.out.println(cliente.getAssento().getNome());

        daoCliente.fechar();

        DAO<Assento> daoAssento = new DAO<>(Assento.class);

        Assento assento = daoAssento.obterPorId(1L);
        System.out.println(assento.getCliente().getNome());

        daoCliente.fechar();
    }

}
