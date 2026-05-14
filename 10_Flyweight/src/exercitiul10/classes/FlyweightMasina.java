package exercitiul10.classes;

import java.util.HashMap;
import java.util.Map;

public class FlyweightMasina {


    private Map<String, Masina> mapMasina = new HashMap<>();


    public Masina getMasina(String model, String culoare, int tipMotor){

        if(mapMasina.get(model)==null){
            Masina m = new Masina( model,  culoare, tipMotor);
            mapMasina.put(model, m);

        }

        return mapMasina.get(model);

    }



}
