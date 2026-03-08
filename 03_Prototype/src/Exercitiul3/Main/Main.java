package Exercitiul3.Main;

import Exercitiul3.Classes.AClient;
import Exercitiul3.Classes.Client;

public class Main {

    public static void main(String[] args){

        AClient client1 = new Client("Sovar Izabela" , 1, "sovarizabela@gmail.com", "12345689");

        AClient client2 = client1.copy();

        System.out.println("Client1" + client1);
        System.out.println("Client2" + client2);


    }


}
