package exercitiul3.main;

import exercitiul3.module.Card;
import exercitiul3.module.Client;
import exercitiul3.module.FlyweightClient;

public class Main {

    public static void main(String [] args){

        Card card1 = new Card("BCR", "Militari", "ABCDEF", 5000.0F);
        Card card2 = new Card("ING", "Tricodava", "ABCDEF", 25000.0F);
        Card card3 = new Card("BTI", "Titan", "ABCDEFghi", 4000.0F);
        Card card4 = new Card("BRD", "Vitan", "ABCDEF", 5000.0F);


        FlyweightClient flyweightClient = new FlyweightClient();
        Client client = flyweightClient.getClient("Sovar Izabela", "Bucuresti", "000000", " test@test.ro");
        client.detalii(card1);

        System.out.println("----------------Schimbam cheia (numele clintului)----------------");
        Client client1 = flyweightClient.getClient("Pop Elena", "Bucuresti", "000000", " test@test.ro");
        client1.detalii(card1);


    }
}
