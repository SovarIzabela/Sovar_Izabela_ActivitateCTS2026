package exercitiul7.main;

import exercitiul7.classes.Client;
import exercitiul7.classes.LivrareRapida;

public class Main {

    public static void main(String[] args){


        Client c1 = new Client("Client1");

        c1.livrareComanda("abc123");
        c1.setTipLivrare(new LivrareRapida());
        c1.livrareComanda("123vsr");




    }
}
