package exercitiul3.Main;

import exercitiul3.Classes.Builder;
import exercitiul3.Classes.BuilderRezervare;
import exercitiul3.Classes.Rezervare;

public class Main {

    public static void main(String[] args){

        BuilderRezervare builder = new Builder();

        Rezervare rezervare1 = ((Builder)builder).setAreBauturaRacoritoareInclusa(true).setNumeClient("Sovar Izabela").build();

        System.out.println("Rezervare1" + rezervare1);

        Rezervare rezervare2 = ((Builder)builder).setAreScaunErgonomic(true).setAreMancareInclusa(true).build();

        System.out.println("Rezervare12" + rezervare2);



    }

}
