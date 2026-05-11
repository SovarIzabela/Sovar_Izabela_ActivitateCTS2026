package exercitiul5.main;

import exercitiul5.classes.Client;
import exercitiul5.classes.Iobserver;
import exercitiul5.classes.SalaSport;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Iobserver abonat1 = new Client("Abonat 1" , 40);
        Iobserver abonat2 = new Client("Abonat 2" , 30);
        Iobserver abonat3 = new Client("Abonat 3" , 25);

        List<Iobserver> listaAbonati = new ArrayList<>();
        listaAbonati.add(abonat1);
        listaAbonati.add(abonat2);
        listaAbonati.add(abonat3);

        SalaSport sala1 = new SalaSport("Sala1", listaAbonati);
        sala1.notificareMeciFotbal();
        System.out.println("------------------------------");
        sala1.notificareMeciHandbal();
        System.out.println("------------------------------");
        sala1.notificareMediVolei();

    }

}
