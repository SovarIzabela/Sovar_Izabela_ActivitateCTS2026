package exercitiul4.Main;

import exercitiul4.Classes.AMijlocTransport;
import exercitiul4.Classes.Autobuz;

import java.util.ArrayList;
import java.util.List;

public class Main {

   public static void main(String[] args) {

       List<Integer> lista = new ArrayList<>();
       lista.add(137);
       lista.add(222);
       lista.add(235);
       AMijlocTransport transport1 = new Autobuz("Solaris", "S101", 2020, 120, false, lista);

       System.out.println("Transport1" + transport1);

       AMijlocTransport transport2 = transport1.clone();
       transport2.nrLiniiTransport.add(95);

       System.out.println("Transport2" + transport2);

       System.out.println("Transport1" + transport1);


    }
}
