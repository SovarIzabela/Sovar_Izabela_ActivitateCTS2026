package exercitiul4.classes;

import java.util.HashMap;
import java.util.Map;

public class FlyweightSpectator {

    private Map<Integer, Spectator > mapSpectator = new HashMap<>();

    public Spectator getSpectator(int id,  int inaltime, int latime){

        if(mapSpectator.get(id)==null){
            Spectator spectator = new Spectator(id, inaltime, latime);
            mapSpectator.put(id, spectator);
        }
        return mapSpectator.get(id);
    }



}
