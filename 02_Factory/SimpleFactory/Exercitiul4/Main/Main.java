package Exercitiul4.Main;

import Exercitiul4.Classes.ETipSportiv;
import Exercitiul4.Classes.Factory;
import Exercitiul4.Classes.ISportiv;

public class Main {


    public static void main(String[] args) throws Exception {

        Factory factory1 = new Factory();

        ISportiv sportiv1 = factory1.getSportiv(ETipSportiv.atacant, "Pop", "Dinamo", 45, 25, "Liga1") ;
        ISportiv sportiv2 = factory1.getSportiv(ETipSportiv.portar, "Gigel", "Steaua", 25, 30, "Liga2") ;

        sportiv1.descriere();
        sportiv2.descriere();

        System.out.println("Sportiv 1 : " + sportiv1);
        System.out.println("Sportiv 2 : " + sportiv2);

    }



}
