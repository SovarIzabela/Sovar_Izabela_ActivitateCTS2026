package exercitiul10.main;

import exercitiul10.classes.*;

public class Main {

    public static void main(String[] args){

        AbstractAlgoritmRuta cost = new AlgoritmCostMinim();
        AbstractAlgoritmRuta statii = new AlgoritmStatiiMinime();

        ReteaTransport retea = new ReteaTransport("Bucuresti", 10, 300);

        Ruta ruta1 = new Ruta(" ruta 1" );
        ruta1.calculeazaRuta(retea, "Statie1", " Statie5");

        ruta1.setRuta(new AlgoritmCostMinim() );

        ruta1.calculeazaRuta(retea, "Statie5", " Statie 7");


    }


}
