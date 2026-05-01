package exercitiul3.main;

import exercitiul3.classes.ClientRestaurant;
import exercitiul3.classes.IRestaurant;
import exercitiul3.classes.Iobserver;
import exercitiul3.classes.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args){

        Iobserver client1 = new ClientRestaurant("Client1","00000000", true, 205, 25);
        Iobserver client2 = new ClientRestaurant("Client2","02478521", true, 207, 45);
        Iobserver client3 = new ClientRestaurant("Client3","07561028978", true, 208, 60);
        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);

        List<Iobserver> listaClienti = new ArrayList<>();
        listaClienti.add(client1);
        listaClienti.add(client2);
        listaClienti.add(client3);


        IRestaurant restaurant = new Restaurant("Duman", listaClienti);
        restaurant.adaugaClient(new ClientRestaurant("Client4", "077045689", true, 13, 45 ));
        System.out.println("--------------------------------------");
        ((Restaurant)restaurant).notificareMeniuNou();
        restaurant.stergeClient(client3);
        System.out.println("-------------------------------");
        ((Restaurant)restaurant).notificareMeniuNou();

    }

}
