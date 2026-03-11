package Exercitiul6.Main;

import Exercitiul5.Classes.Factory;
import Exercitiul6.Classes.FactoryPlata;
import Exercitiul6.Classes.Plata;
import Exercitiul6.Classes.TipPlata;

public class Main {

    public static void main(String[] args) throws Exception {

        FactoryPlata factory = new FactoryPlata();
        Plata plata1 = factory.crearePlata(TipPlata.card, 25, 500);
        plata1.proceseazaPlata(10);
        System.out.println("Sold final este " + plata1);

        Plata plata2 = factory.crearePlata(TipPlata.paypall, 125, 200);
        plata2.proceseazaPlata(150);
        System.out.println("Sold final este " + plata2);
    }
}
