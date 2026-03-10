package Exercitiul5.Main;

import Exercitiul5.Classes.IRezervareEveniment;
import Exercitiul5.Classes.RezervareEveniment;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args){

        List<String> lista = new ArrayList<>();
        lista.add("Ionescu");
        lista.add("Popescu");
        IRezervareEveniment eveniment1 = new RezervareEveniment("Eveniment1", "Restaurant1", 200,"party", lista);

        System.out.println(eveniment1);

        IRezervareEveniment eveniment2 = eveniment1.copiaza();
        System.out.println(eveniment2);
        ((RezervareEveniment)eveniment2).getParticipanti().add("Vasile");

        System.out.println(eveniment1);
        System.out.println(eveniment2);



    }




}
