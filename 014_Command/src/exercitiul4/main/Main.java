package exercitiul4.main;

import exercitiul4.classes.*;

public class Main {
    public static void main(String[] args){


        IMasaRestaurant masa = new MasaRestaurant(12, 4);
        Icommand comandaOcupare = new ComandaOcupare(masa);
        Icommand comanaRezervare = new ComandaRezervare(masa);

        Operator operator = new Operator();
        operator.lanseazaComanda(comandaOcupare);
        operator.lanseazaComanda(comanaRezervare);






    }
}
