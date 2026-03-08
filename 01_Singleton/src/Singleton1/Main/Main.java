package Singleton1.Main;

import Singleton1.Classes.ConfiguratieBanca;

public class Main {


     public static void main(String[] args) {


         ConfiguratieBanca banca1 = ConfiguratieBanca.getInstance();
         System.out.println("Banca1" + banca1);

         ConfiguratieBanca banca2 = ConfiguratieBanca.getInstance();
         System.out.println("Banca2" + banca2);

         System.out.println(banca1==banca2);

    }


}
