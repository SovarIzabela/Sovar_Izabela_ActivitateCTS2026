package exercitiul5.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class VerificareAntecedenteStadion {


    private String serieBuletin;

    public VerificareAntecedenteStadion(String serieBuletin) {
        this.serieBuletin = serieBuletin;
    }

    public boolean areAntecedente(){
        List<String> listaAntecedente = Arrays.asList("ABC123" , "DVI457" , "C4218");

        for(String serie: listaAntecedente){

            if(serie.equals(serieBuletin)){
                System.out.println("persoana are antecedente pe stadion");
                return true;
            }
        }
        System.out.println("Persoana nu are antecedente pe Stadion!");
        return false;

    }







}
