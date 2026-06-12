package estudosJPA.teste.muitospramuitos;

import estudosJPA.infra.DAO;
import estudosJPA.modelo.muitospramuitos.Sobrinho;
import estudosJPA.modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {
    public static void main(String[] args) {

        Tio tia1 = new Tio("Maria");
        Tio tio1 = new Tio("João");

        Sobrinho sobrinho1 = new Sobrinho("Davi");
        Sobrinho sobrinha1 = new Sobrinho("Ana");

        tia1.getSobrinhos().add(sobrinho1);
        sobrinho1.getTios().add(tia1);

        tia1.getSobrinhos().add(sobrinha1);
        sobrinha1.getTios().add(tia1);

        tio1.getSobrinhos().add(sobrinho1);
        sobrinho1.getTios().add(tio1);

        tio1.getSobrinhos().add(sobrinha1);
        sobrinha1.getTios().add(tio1);

        DAO<Tio> dao = new DAO<>();
        dao.abrirT()
                .incluir(tia1)
                .incluir(tio1)
                .fecharT()
                .fechar();
    }
}
