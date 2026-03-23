package exercitiul1.main;

import exercitiul1.classes.ProxyRezervare;
import exercitiul1.classes.Rezervare;

public class Main {

    public static void main(String [] args){

        Rezervare rezervare1 = new Rezervare("Iza", 2);
        rezervare1.creazaRezervare();

        System.out.println("------------------Rezervare cu proxy-------------------");
        ProxyRezervare proxyRezervare = new ProxyRezervare(rezervare1);
        proxyRezervare.creazaRezervare();

    }
}
