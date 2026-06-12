package estudosJPA.teste.umpraum;

import estudosJPA.infra.DAO;
import estudosJPA.modelo.umpraum.Assento;
import estudosJPA.modelo.umpraum.Cliente;

public class NovoClienteAssento2 {
    public static void main(String[] args) {
        Assento assento = new Assento("4D");
        Cliente cliente = new Cliente("Rodrigo",assento);

        DAO<Cliente> dao = new DAO<>(Cliente.class);
        dao.incluirAtomico(cliente);
    }
}
