package exercitiul1.main;

import exercitiul1.Classes.IBuilder;
import exercitiul1.Classes.Rezervare;
import exercitiul1.Classes.RezervareBuilder;

public class Main {


    public static void main(String[] args) {

        IBuilder builder = new RezervareBuilder();

        Rezervare rezervare = ((RezervareBuilder)builder).setAsezareGeam(true).setScauneErgonomice(true).build();
        System.out.println(rezervare);



    }


}
