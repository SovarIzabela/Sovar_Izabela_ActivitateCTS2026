package exercitiul5.main;

import exercitiul5.classes.Decorator;
import exercitiul5.classes.Ispital;
import exercitiul5.classes.Spital;
import exercitiul5.classes.SpitalDecorat;

public class Main {

    public static void main(String[] args){

        Ispital spital1 = new Spital("Pacient1 ", 25);
        spital1.printeazaRezultat();

        System.out.println("--------Decorator--------");

        Decorator spitalDecorat = new SpitalDecorat(spital1);

        spitalDecorat.printeazaRezultat();


    }



}
