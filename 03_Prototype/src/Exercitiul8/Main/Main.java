package Exercitiul8.Main;

import Exercitiul8.Classes.AMasina;
import Exercitiul8.Classes.Masina;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<String> lista = new ArrayList<>();
        lista.add("Masina1");
        lista.add("Masina2");

        AMasina masina1 = new Masina("dacia", "scdf", lista);
        System.out.println(masina1);
        AMasina masina2 = ((Masina)masina1).copiaza();
        System.out.println(masina2);


    }



}
