package exercitiul2.main;

import exercitiul2.classes.Client;
import exercitiul2.classes.PlataCard;
import exercitiul2.classes.PlataCash;

public class Main {

    public static void main(String [] args){

        Client client1 = new Client("Client 1 " , 101, true, new PlataCard());
        Client client2 = new Client("Client 2 " , 102, true);

        client1.plateste(200);
        client2.plateste(500);

        client1.setModplata(new PlataCash());
        client1.plateste(450);


    }
}
