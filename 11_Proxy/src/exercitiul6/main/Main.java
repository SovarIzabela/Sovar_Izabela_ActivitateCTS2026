package exercitiul6.main;

import exercitiul6.classes.Client;
import exercitiul6.classes.ProxyBilet;
import exercitiul6.classes.VanzareBilet;

public class Main {

    public static void main(String[] args){

        Client client = new Client("Client 1" , 13);
        Client client2 = new Client("Client 2" , 14);

        VanzareBilet vanzareBilet = new VanzareBilet();
        vanzareBilet.vindeBilet(client);
        vanzareBilet.vindeBilet(client2);
        System.out.println("-----Cu proxy-------");
        ProxyBilet proxyBilet = new ProxyBilet(vanzareBilet);
        proxyBilet.vindeBilet(client);
        proxyBilet.vindeBilet(client2);

    }


}
