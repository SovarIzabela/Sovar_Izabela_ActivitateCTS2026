package exercitiul4.main;

import exercitiul4.classes.*;

public class Main {

    public static void main(String[] args){

        Client c1 = new Client("Clint1", 2);
        Client c2 = new Client("Clint1", 5);
        Client c3 = new Client("Clint1", 10);
        Client c4 = new Client("Clint1", 11);

        AHandler masaMare = new MasaMare();
        AHandler masaMica = new MasaMica();
        AHandler masaMedie = new MasaMedie();
        AHandler salon = new SalonEvenimente();

        masaMica.setHandler(masaMedie);
        masaMedie.setHandler(masaMare);
        masaMare.setHandler(salon);

        masaMica.repartizareClient(c1);
        masaMica.repartizareClient(c2);
        masaMica.repartizareClient(c3);
        masaMica.repartizareClient(c4);




    }





}
