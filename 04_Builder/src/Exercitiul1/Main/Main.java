package Exercitiul1.Main;

import Exercitiul1.Classes.IBuilder;
import Exercitiul1.Classes.Rezervare;
import Exercitiul1.Classes.RezervareBuilder;

public class Main {


    public static void main(String[] args) {

        IBuilder builder = new RezervareBuilder();

        Rezervare rezervare = ((RezervareBuilder)builder).setAsezareGeam(true).setScauneErgonomice(true).build();
        System.out.println(rezervare);



    }


}
