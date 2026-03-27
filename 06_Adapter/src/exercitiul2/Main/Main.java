package exercitiul2.Main;

import exercitiul2.Classes.*;

public class Main {
    public static void main(String[] args) {

        IMedicament farmacie = new Farmacia(10, "Algocalmin", 1000, false);
        farmacie.setareMedicament(10);
        farmacie.verificaDisponibilitate(100);

        IStocDepozit stocDepozit = new StocDepozit(11,"Nurofen",1500, false);
        stocDepozit.verificaStocPentruMedicament(11,150);

        IMedicament medicamentAdaptat = new Adapter(stocDepozit);
        medicamentAdaptat.setareMedicament(11);
        boolean rez = medicamentAdaptat.verificaDisponibilitate(15);
        System.out.println(rez);






    }
}
