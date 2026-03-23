package exercitiul1.main;

import exercitiul1.module.Client;
import exercitiul1.module.FlyweightClient;
import exercitiul1.module.Rezervare;

public class Main {
    public static void main(String [] args){

        Rezervare rezervare1 = new Rezervare(7, 5, 12);
        Rezervare rezervare2 = new Rezervare(5, 2, 17);
        Rezervare rezervare3 = new Rezervare(12, 7, 20);
        Rezervare rezervare4 = new Rezervare(14, 3, 14);
        Rezervare rezervare5 = new Rezervare(17, 4, 15);

        FlyweightClient flyweightClient = new FlyweightClient();
        Client client1=flyweightClient.getClient("Sovar", "00000000", "iza@gmail.com");
        client1.descriere(rezervare1);
        client1.descriere(rezervare2);
        client1.descriere(rezervare3);
        client1.descriere(rezervare4);
        client1.descriere(rezervare5);

        System.out.println("--------------------Acelasi nume de client---------");

        Client client2=flyweightClient.getClient("Sovar", "075610242", "test@gmail.com");
        client2.descriere(rezervare1);
        client2.descriere(rezervare2);
        client2.descriere(rezervare3);
        client2.descriere(rezervare4);
        client2.descriere(rezervare5);


        System.out.println("--------------------Alt nume de client---------");

        Client client3=flyweightClient.getClient("Izabela", "075610242", "test@gmail.com");
        client3.descriere(rezervare1);
        client3.descriere(rezervare2);
        client3.descriere(rezervare3);
        client3.descriere(rezervare4);
        client3.descriere(rezervare5);


    }
}
