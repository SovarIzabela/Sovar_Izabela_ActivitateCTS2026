package exercitiul11.main;

import exercitiul11.classes.Flyweight;
import exercitiul11.classes.PictogramaFacilitate;

public class Main {


    public static void main(String[] args){



        Flyweight flyweight = new Flyweight();
       PictogramaFacilitate p1=  flyweight.getPictograma("Pictograma 1", " verde");
       p1.afiseaza(12, 14, "parcare");
       p1.afiseaza(17, 14, "sala");
       p1.afiseaza(12, 15, "parcare");





    }




}
