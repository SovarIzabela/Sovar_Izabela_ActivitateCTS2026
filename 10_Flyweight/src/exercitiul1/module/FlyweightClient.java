package exercitiul1.module;

import java.util.HashMap;
import java.util.Map;

public class FlyweightClient {


    private Map<String, Client> clientMap = new HashMap<>();

    public Client getClient(String nume, String numarTelefon, String adresaEmail){
        if(clientMap.get(nume)==null){
            Client client = new Client(nume, numarTelefon, adresaEmail);
            clientMap.put(nume, client);
        }

        return clientMap.get(nume);
    }



}
