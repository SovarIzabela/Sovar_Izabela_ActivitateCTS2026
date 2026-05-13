package exercitiul9.classes;

import java.util.HashMap;
import java.util.Map;

public class FlyweightSoldat {

    Map<Integer, Soldat> mapSoldat = new HashMap<>();


    public Soldat getSoldat(int tipSoldat, String tipArmura, String modelArma, String culoareUniforma){


        if(mapSoldat.get(tipSoldat)==null){
            Soldat soldat = new Soldat(tipSoldat,tipArmura,modelArma,culoareUniforma);
            mapSoldat.put(tipSoldat, soldat);

        }

        return mapSoldat.get(tipSoldat);




    }



}
