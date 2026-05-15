package exercitiul11.classes;

import java.util.HashMap;
import java.util.Map;

public class Flyweight {


    private Map<String, PictogramaFacilitate> mapPictograme = new HashMap<>();


    public PictogramaFacilitate getPictograma(String tipPictograma, String culoare){

        if(mapPictograme.get(tipPictograma)==null){
            PictogramaFacilitate pictogramaFacilitate = new PictogramaFacilitate(tipPictograma, culoare);
            mapPictograme.put(tipPictograma, pictogramaFacilitate);
        }

        return mapPictograme.get(tipPictograma);

    }




}
