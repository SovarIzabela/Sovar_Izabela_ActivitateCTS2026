package exercitiul10.main;

import exercitiul10.classes.Client;
import exercitiul10.classes.IObserverClient;
import exercitiul10.classes.ISpalatorie;
import exercitiul10.classes.Spalatorie;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args){

        IObserverClient observerClient1 = new Client("Ionescu Ion");
        IObserverClient observerClient2 = new Client("Matei Gigel");
        IObserverClient observerClient3 = new Client("Vulpescu Maria");
        IObserverClient observerClient4 = new Client("Sovar Izabela");
        IObserverClient observerClient5 = new Client("Ionescu Ion");


        List<IObserverClient> lista = new ArrayList<>();
        lista.add(observerClient1);
        lista.add(observerClient2);
        lista.add(observerClient3);
        lista.add(observerClient4);
        lista.add(observerClient5);

        ISpalatorie spalatorie = new Spalatorie(lista);
        spalatorie.notificaClient("Mai sunt 3 persoane la coada!");
        System.out.println("-------------------------------------------");
        spalatorie.notificaClient("Mai sunt 2 persoane la coada!");
        System.out.println("-------------------------------------------");
        spalatorie.notificaClient("Mai este 1 persoana la coada!");


    }


}
