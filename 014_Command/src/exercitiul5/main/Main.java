package exercitiul5.main;

import exercitiul5.classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Iautobuz autobuz = new Autobuz(101);
        Icommand comanda = new PlecareAutobuz(autobuz, 101);
        Icommand comanda1 = new PlecareAutobuz(autobuz, 102);
        Icommand comanda2 = new PlecareAutobuz(autobuz, 104);


        List<Icommand> listaComenzi = new ArrayList<>();
        listaComenzi.add(comanda);
        listaComenzi.add(comanda1);
        listaComenzi.add(comanda2);


        Operator operator = new Operator(listaComenzi);
        operator.lanseazaComanda();




    }
}
