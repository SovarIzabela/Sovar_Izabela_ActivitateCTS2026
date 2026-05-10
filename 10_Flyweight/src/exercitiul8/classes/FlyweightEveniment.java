package exercitiul8.classes;

import java.util.HashMap;
import java.util.Map;

public class FlyweightEveniment {

    private Map<String , Eveniment> mapEveniment = new HashMap<>();

    public Eveniment getEveniment(String artist, String locatieEevniment, String dataEevniment){

        if(mapEveniment.get(artist)==null){
            Eveniment ieveniment = new Eveniment(artist, locatieEevniment, dataEevniment);
            mapEveniment.put(artist, ieveniment);
        }

        return mapEveniment.get(artist);

    }



}
