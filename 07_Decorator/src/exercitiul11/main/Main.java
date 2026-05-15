package exercitiul11.main;

import exercitiul11.classes.ADecoratorRestaurant;
import exercitiul11.classes.DecoratorRestaurant;
import exercitiul11.classes.IProdus;
import exercitiul11.classes.Produs;

public class Main {

    public static void main(String[] args){

        IProdus produs = new Produs("Pizza " ,45 );
        IProdus produs1 = new Produs("Paste " ,35 );
        IProdus produs2 = new Produs("Lasagna " ,55 );
        IProdus produs3 = new Produs("Salata ton " ,15 );
        produs.comandaProdus();



        ADecoratorRestaurant produsDecorat = new DecoratorRestaurant(produs, "ketchup");
        produsDecorat.comandaProdus();
        ADecoratorRestaurant produsDecorat2 = new DecoratorRestaurant(produs, "parmezan");
        produsDecorat2.comandaProdus();
        ADecoratorRestaurant produsDecorat3 = new DecoratorRestaurant(produs, "parmezan");
        produsDecorat3.comandaProdus();

        ADecoratorRestaurant produsDecorat4 = new DecoratorRestaurant(produs, "ketchup");
        produsDecorat4.comandaProdus();




    }

}
