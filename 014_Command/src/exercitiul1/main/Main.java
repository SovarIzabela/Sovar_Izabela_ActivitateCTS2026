package exercitiul1.main;

import exercitiul1.classes.*;

public class Main {

    public static void main(String[] args){

        AjutorFarmacistReceiver ajutorFarmacie1 = new AjutorFarmacistReceiver();
        FarmacistOperator farmacistOperator1 = new FarmacistOperator();
        IComanda comanda1 = new ComandaAducereMedicament(ajutorFarmacie1, "Nurofen");
        farmacistOperator1.lanseazaComanda(comanda1);

    }
}
