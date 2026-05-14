package exercitiul10.main;

import exercitiul10.classes.*;

public class Main {


    public static void main(String[] args){

        AHandler director = new Director();
        AHandler manager = new Manager();
        AHandler receptioner = new Receptioner();

        receptioner.setUrmator(manager);
        manager.setUrmator(director);


        Rezervare rezervare = new Rezervare("ocupata","vip" , 4 );
       receptioner.rezervare(rezervare);


    }



}
