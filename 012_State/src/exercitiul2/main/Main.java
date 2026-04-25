package exercitiul2.main;

import exercitiul2.classes.*;

public class Main {

    public static void main(String[] args){


        Reteta reteta1 = new Reteta("101q", "Client 1 ", true, 5);
        Reteta reteta2 = new Reteta("102awq", "Client 1 ", false, 3);
        Reteta reteta3 = new Reteta("101qwsd", "Client 2 ", true, 4);
        Istare stareEmisa = new Emisa();
        Istare stareSolicitata = new Solicitata();
        Istare stareAchizitionata = new Achizitionata();
        stareEmisa.doAction(reteta1);
        stareAchizitionata.doAction(reteta1);
        stareSolicitata.doAction(reteta2);
        stareEmisa.doAction(reteta3);

    }

}
