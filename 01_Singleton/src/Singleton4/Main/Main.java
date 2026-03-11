package Singleton4.Main;

import Singleton4.Classes.ConfigurareAplicatie;

public class Main {

   public static void main(String[] args) {

       ConfigurareAplicatie configurareAplicatie1 = ConfigurareAplicatie.getInstance("black", 2, true);
       ConfigurareAplicatie configurareAplicatie2 = ConfigurareAplicatie.getInstance("white", 3, false);

        configurareAplicatie1.afisareConfigurare();
        configurareAplicatie2.afisareConfigurare();

        System.out.println(configurareAplicatie1==configurareAplicatie2);

    }

}
