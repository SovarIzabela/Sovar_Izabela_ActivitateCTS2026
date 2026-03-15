package Exercitiul7.Main;

import Exercitiul7.Classes.AMasina;
import Exercitiul7.Classes.Factory;
import Exercitiul7.Classes.TipTunning;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {


        Factory f1 = new Factory();
        List<String> lista1 = new ArrayList<>();
        lista1.add("Serviciu1");
        lista1.add("Serviciu2");
        AMasina masina1 = f1.intoarceMasina(TipTunning.luxury, "BMW", "abc" , lista1);
        System.out.println(masina1);

    }
}
