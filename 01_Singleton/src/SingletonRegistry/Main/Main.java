package SingletonRegistry.Main;

import SingletonRegistry.Classes.Piata;

public class Main {

   public static void main(String[] args) {

        Piata p1 = Piata.getInstance("Drtaberei", "DrTaberei", 200);
        System.out.println(p1);

       Piata p2 = Piata.getInstance("Militari", "Gorjului", 100);
       System.out.println(p2);

       Piata p3 = Piata.getInstance("Titan", "PiataTitan", 150);
       System.out.println(p3);

       Piata p4 = Piata.getInstance("Titan", "Market", 150);
       System.out.println(p4);

    }



}
