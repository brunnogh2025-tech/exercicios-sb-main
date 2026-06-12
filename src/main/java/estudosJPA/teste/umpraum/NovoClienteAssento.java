package estudosJPA.teste.umpraum;

import estudosJPA.infra.DAO;
import estudosJPA.modelo.umpraum.Assento;
import estudosJPA.modelo.umpraum.Cliente;

public class NovoClienteAssento {
    public static void main(String[] args) {
        Assento assento = new Assento("16C");
        Cliente cliente = new Cliente("Ana", assento);

        DAO<Assento> daoAssento = new DAO<Assento>();
        DAO<Cliente> daoCliente = new DAO<Cliente>();

        daoAssento.abrirT()
                .incluir(assento)
                .fecharT()
                .fechar();

        daoCliente.abrirT()
                .incluir(cliente)
                .fecharT()
                .fechar();
    }
}
