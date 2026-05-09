package exercitiul7.classes;

import java.util.HashMap;
import java.util.Map;

public class FlyweightCopac {

    Map<String, Copac> mapCopaci = new HashMap<>();


    public Copac getCopac(String tipCopac, boolean areFrunza){

        if(mapCopaci.get(tipCopac)==null){
            Copac copac = new Copac(tipCopac, areFrunza);
            mapCopaci.put(tipCopac, copac);


        }
        return mapCopaci.get(tipCopac);

    }



}
