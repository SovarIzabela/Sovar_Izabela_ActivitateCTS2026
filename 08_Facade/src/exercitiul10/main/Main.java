package exercitiul10.main;

import exercitiul10.classes.Facade;
import exercitiul10.classes.Masina;

public class Main {


    public static void main(String[] args){


        Masina m1 = new Masina("Dacia");
        Masina m2 = new Masina("BMW");
        Masina m3 = new Masina("Mercedes");
        Masina m4 = new Masina("Volvo");
        Masina m5 = new Masina("Renault");



        Facade facade = new Facade();
        facade.doarSpălare(m1, "Spumant1", " microfibra");
        facade.spalareCuDegresare(m2, "Spumant2", "Solutie1 " , 100);
        facade.spalareCuDegresare(m3, "Spumant 2", "Solutie5", 50);
        facade.spalareCuDegresare(m4, "Spumant 2", "Solutie5", 50);
        facade.spalareCuDegresare(m5, "Spumant 2", "Solutie5", 50);




    }


}
