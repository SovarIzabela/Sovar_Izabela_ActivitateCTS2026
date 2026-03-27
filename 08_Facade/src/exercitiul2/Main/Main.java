package exercitiul2.Main;

import exercitiul2.Classes.Facade;

public class Main {
    public static void main(String[] args){

        Facade facade = new Facade();
       boolean rezultat =  facade.vindeMedicament("Popescu", 101, "Nurofen", 1500, 10 );
        System.out.println(rezultat);
    }
}
