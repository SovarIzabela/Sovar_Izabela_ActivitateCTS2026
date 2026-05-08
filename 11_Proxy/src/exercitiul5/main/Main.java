package exercitiul5.main;

import exercitiul5.classes.Internare;
import exercitiul5.classes.Pacient;
import exercitiul5.classes.Proxy;

public class Main {

    public static void main(String[] args){

        Pacient pacient1 = new Pacient("Izabela" , true);
        Pacient pacient2 = new Pacient("Elena" , false);

        Internare internare = new Internare();
        System.out.println("---Fara Proxy----");
        internare.interneazaPacient(pacient2);

        Proxy proxy= new Proxy(internare);
        System.out.println("---Cu Proxy----");
        proxy.interneazaPacient(pacient2);

    }
}
