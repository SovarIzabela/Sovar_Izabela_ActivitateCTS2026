package exercitiul3.main;

import exercitiul3.classes.*;

public class Main {
    public static void main(String[] args){


        Imedic medic = new Medic("Medic 1 ", " orl");
        Icomand comandaTratare = new ComandaTratare(medic);
        Icomand comandaInternare = new ComandaInternare(medic);

        Operator operator = new Operator();
        operator.lanseazaComanda(comandaInternare);
        operator.lanseazaComanda(comandaTratare);


    }
}
