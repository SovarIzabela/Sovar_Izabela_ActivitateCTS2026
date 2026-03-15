package Singleton5.Main;

import Singleton5.Classes.AMasina;
import Singleton5.Classes.Masina;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String [] args){

        List<String> lista = new ArrayList<>();
        lista.add("Mesaj1");
        lista.add("Mesaj2");
        Masina masina1 = Masina.getInstance("BMV", "ABC" , lista);
        System.out.println(masina1);

        List<String> lista2 = new ArrayList<>();
        lista.add("Mesaj1");
        lista.add("Mesaj2");
        Masina masina2 = Masina.getInstance("Mercedez", "ABC" , lista2);
        System.out.println(masina2);

    }
}
