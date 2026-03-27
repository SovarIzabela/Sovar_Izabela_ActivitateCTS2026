package exercitiul2.main;

import exercitiul2.classes.Client;
import exercitiul2.classes.FlyweightClient;
import exercitiul2.classes.IClient;
import exercitiul2.classes.Reteta;

public class Main {


    public static void main(String[] args){



        Reteta reteta = new Reteta("A321", 275.5f, 5);
        Reteta reteta1 = new Reteta("I321", 25.5f, 3);
        Reteta reteta2 = new Reteta("ACD321", 375.5f, 7);
        Reteta reteta3 = new Reteta("A321", 120.5f, 2);

        FlyweightClient flyweightClient = new FlyweightClient();
        Client client = flyweightClient.getClient("Iza", "A321");
        client.descriere(reteta);
        client.descriere(reteta1);
        client.descriere(reteta2);
        client.descriere(reteta3);

        System.out.println("--------Nu schimbam cheia--------------");

        Client client2 = flyweightClient.getClient("Iza", "ZA321");
        client2.descriere(reteta);
        client2.descriere(reteta1);
        client2.descriere(reteta2);
        client2.descriere(reteta3);


        System.out.println("--------schimbam cheia--------------");

        Client client3 = flyweightClient.getClient("Maria", "ABC321");
        client3.descriere(reteta);
        client3.descriere(reteta1);
        client3.descriere(reteta2);
        client3.descriere(reteta3);


    }



}
