package exercitiul8.main;

import exercitiul8.classes.ADecorator;
import exercitiul8.classes.Cafenea;
import exercitiul8.classes.Decorator;
import exercitiul8.classes.Icafenea;

public class Main {


    public static void main(String[] args){

        Icafenea cafenea1 = new Cafenea(101, 55);
        cafenea1.emiteBon(55);

        ADecorator decorator  = new Decorator(cafenea1);
        decorator.emiteBon(55);



    }

}
