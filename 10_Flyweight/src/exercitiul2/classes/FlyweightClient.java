package exercitiul2.classes;

import java.util.HashMap;
import java.util.Map;

public class FlyweightClient {

    private Map<String, Client> mapClient = new HashMap<>();

    public Client getClient(String numeClient, String numarAsigurare){
        if(mapClient.get(numeClient)==null){
            Client client=new Client( numeClient, numarAsigurare);
            mapClient.put(numeClient, client );
        }

        return mapClient.get(numeClient);
    }



}
