package exercitiul4.main;

import exercitiul4.classes.Autobuz;
import exercitiul4.classes.ProxyAutobuz;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){

        List <String> listaStatii = new ArrayList<>();
        listaStatii.add("Favorit");
        listaStatii.add("Afi");
        listaStatii.add("Unirii");

        Autobuz autobuz = new Autobuz(101, "Bucuresti", listaStatii);

        autobuz.oprireStatie("Favorit");

        ProxyAutobuz proxyAutobuz = new ProxyAutobuz(autobuz, 0);
        proxyAutobuz.oprireStatie("Afi");


    }
}
