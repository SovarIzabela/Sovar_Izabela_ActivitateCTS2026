package exercitiul3.module;

import java.util.HashMap;
import java.util.Map;

public class FlyweightClient {

    private Map<String, Client> mapClienti = new HashMap<>();


    public Client getClient(String numeClient, String adresaClient, String numarTelefon, String adresaEmail){

        if(mapClienti.get(numeClient)==null){
            Client client = new Client( numeClient, adresaClient, numarTelefon, adresaEmail);
            mapClienti.put(numeClient, client);
        }
            return mapClienti.get(numeClient);
    }




}
