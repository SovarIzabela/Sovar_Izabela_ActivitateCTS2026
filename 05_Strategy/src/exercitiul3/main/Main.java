package exercitiul3.main;

import exercitiul3.classes.ClientRestaurant;
import exercitiul3.classes.IModPlata;
import exercitiul3.classes.PlataCard;
import exercitiul3.classes.PlataCash;

public class Main {
    public static void main(String [] args){

        ClientRestaurant client1 = new ClientRestaurant("Client1", "077056489", true, true,101);
        ClientRestaurant client12= new ClientRestaurant("Client2", "075056485", true, true, new PlataCard(), 232);

        client12.plateste(405.00f);
        client1.plateste(325.7f);


        client12.setModPlata(new PlataCash());
        client12.plateste(550.00f);


    }
}
