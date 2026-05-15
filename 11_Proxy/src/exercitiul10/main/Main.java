package exercitiul10.main;

import exercitiul10.classes.Curs;
import exercitiul10.classes.ProxyCurs;

public class Main {

    public static void main(String[] args){


        Curs c1 = new Curs("Curs CTS");


        ProxyCurs curs = new ProxyCurs(c1);
        curs.afiseazaContinut("student");
        curs.afiseazaContinut("student premium");
        curs.afiseazaContinut("profesor");




    }



}
