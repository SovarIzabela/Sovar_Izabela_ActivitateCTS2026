package exercitiul6.classes;

import java.util.HashMap;
import java.util.Map;

public class FlyweightAutobuz {


    private Map<String, AutobuzLinie> mapAutobuz = new HashMap<>();

    public AutobuzLinie getAutobuz(String model, String anFabricatie, int numarLocuri){

        if(mapAutobuz.get(model)==null){
            AutobuzLinie autobuzLinie = new AutobuzLinie( model, anFabricatie, numarLocuri);
            mapAutobuz.put(model, autobuzLinie);

        }
        return mapAutobuz.get(model);
    }



}
