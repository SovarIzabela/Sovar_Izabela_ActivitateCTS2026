package FactoryMethod.Exercitiul4.Main;

import Exercitiul4.Classes.Atacant;
import Exercitiul4.Classes.Fundas;
import Exercitiul4.Classes.ISportiv;
import Exercitiul4.Classes.Portar;
import FactoryMethod.Exercitiul4.Classes.*;

public class Main {

    public static void main(String[] args){

        FactoryAtacant factoryAtacant = new FactoryAtacant();
        FactoryFundas factoryFundas = new FactoryFundas();
        FactoryPortar factoryPortar = new FactoryPortar();

        Isportiv sportiv1 = factoryFundas.getSportiv("Popescu", 15, 25, "Dinamo", "Juniori");
        Isportiv sportiv2 = factoryAtacant.getSportiv("Ionescu", 35, 85, "FcArges", "liga B");
        Isportiv sportiv3 =factoryPortar.getSportiv("Matei", 28,32,"Dinamo", "B");

        sportiv1.descriere();
        sportiv2.descriere();
        sportiv3.descriere();

        System.out.println("Sportiv 1" + sportiv1);
        System.out.println("Sportiv 2" + sportiv2);
        System.out.println("Sportiv 3" + sportiv3);



    }
}
