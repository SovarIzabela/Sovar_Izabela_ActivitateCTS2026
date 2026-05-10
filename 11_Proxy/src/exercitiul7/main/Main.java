package exercitiul7.main;

import exercitiul7.classes.Aplicatie;
import exercitiul7.classes.Iaplicatie;
import exercitiul7.classes.ProxyAplicatie;

public class Main {

    public static void main(String[] args){


        Aplicatie iaplicatie = new Aplicatie("Aplicatie1", " fisier1", false);
        iaplicatie.descarcaFisier();
        Iaplicatie aplicatie2 = new ProxyAplicatie(iaplicatie);
        aplicatie2.descarcaFisier();


    }



}
