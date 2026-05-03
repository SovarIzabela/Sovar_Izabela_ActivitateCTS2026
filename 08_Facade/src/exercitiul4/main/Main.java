package exercitiul4.main;

import exercitiul4.classes.Facade;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){


        List<Integer> listaPatliber = new ArrayList<>();
        List<Integer> listaPaturiOcupate = new ArrayList<>();

        listaPatliber.add(5);
        listaPatliber.add(6);
        listaPatliber.add(7);
        listaPatliber.add(8);

        listaPaturiOcupate.add(1);
        listaPaturiOcupate.add(2);
        listaPaturiOcupate.add(3);
        listaPaturiOcupate.add(4);


        Facade facade = new Facade();
        facade.internarePacient("Pacient1" , true, 40, "raceala",
                true, "Medic1", "Orl", "Universitar",
                "Infectioase", listaPaturiOcupate, listaPatliber, 7);






    }


}
