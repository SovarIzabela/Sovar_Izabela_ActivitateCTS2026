package Exercitiul5.classes;

import java.util.HashMap;
import java.util.Map;

public class FlyweightPacient {


    private Map<String, Pacient> mapPacient = new HashMap<>();

    public Pacient getPacient(String numePacient, String numarTelefon, String adresa, int varsta){

        if(mapPacient.get(numePacient)==null){
            Pacient pacient = new Pacient( numePacient, numarTelefon,  adresa, varsta);
            mapPacient.put(numePacient, pacient);

            mapPacient.get(numePacient);
        }

        return mapPacient.get(numePacient);

    }


}
