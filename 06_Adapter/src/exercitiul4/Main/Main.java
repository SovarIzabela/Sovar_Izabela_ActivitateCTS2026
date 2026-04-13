package exercitiul4.Main;

import exercitiul4.Classes.*;

public class Main {

    public static void main(String[] args){

        IaplicatiaExistenta aplicatiaExistenta = new AplicatiaExistenta("Client1", "ghencea", 101, "Steaua", " Dinamo", 200.0f);
        aplicatiaExistenta.rezervaBilet();

        AplicatiaEBilet aplicatiaEBilet = new AplicatiaEBilet("Client Ebilet", "Ghencea", 102, "Steaua", " Dinamo", 205.0f);
        aplicatiaEBilet.vindeBilet();

        System.out.println("-----Aplicatia adaptata------------");
        AdapterBilet aplicatiaAdaptata = new AdapterBilet(aplicatiaEBilet);
        aplicatiaAdaptata.rezervaBilet();

    }


}
