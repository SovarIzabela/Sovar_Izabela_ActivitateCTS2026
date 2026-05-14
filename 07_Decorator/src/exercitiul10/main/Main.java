package exercitiul10.main;

import exercitiul10.classes.ADecorator;
import exercitiul10.classes.BiletAvion;
import exercitiul10.classes.Decorator;
import exercitiul10.classes.IBiletAvion;
import exercitiul9.classes.IBilet;

public class Main {


    public static void main(String[] args){


        IBiletAvion biletAvion = new BiletAvion("Sovar Izabela", "Madrid", 1000);
        biletAvion.genereazaBiletAvion();

        System.out.println("----------Bilet Decorat------------------------------");

        ADecorator decorator= new Decorator(biletAvion);
        decorator.genereazaBiletAvion();





    }


}
