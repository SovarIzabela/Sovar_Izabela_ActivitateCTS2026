package exercitiul4.main;

import exercitiul4.classes.Banca;
import exercitiul4.classes.ClientAbonat;
import exercitiul4.classes.IObserver;
import exercitiul4.classes.Ibanca;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        IObserver c1 = new ClientAbonat("Client 1" , 101, "client1@yahoo.com");
        IObserver c2 = new ClientAbonat("Client 2" , 102, "client2@yahoo.com");
        IObserver c3 = new ClientAbonat("Client 3" , 103, "client3@yahoo.com");
        IObserver c4 = new ClientAbonat("Client 4" , 104, "client4@yahoo.com");
        IObserver c5 = new ClientAbonat("Client 5" , 105, "client5@yahoo.com");

        List<IObserver> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        lista.add(c4);
        lista.add(c5);

        Ibanca banca1 = new Banca("BCR", lista);
        ((Banca)banca1).notificareOfertaDepozit();
        System.out.println("------------------------------------------");
        banca1.stergeClient(c1);
        banca1.adaugaClient(new ClientAbonat("Client 5" , 105, "client5@gmail.com"));

        ((Banca)banca1).notificareOfertaDepozit();

    }



}
