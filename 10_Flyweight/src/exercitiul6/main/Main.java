package exercitiul6.main;

import exercitiul6.classes.AutobuzLinie;
import exercitiul6.classes.FlyweightAutobuz;
import exercitiul6.classes.Optionale;

public class Main {

    public static void main(String[] args){


        Optionale optionale1 = new Optionale(137, "Statie1", " Statie16");
        Optionale optionale2 = new Optionale(221, "Statie25", " Statie45");
        Optionale optionale3 = new Optionale(237, "Statie124", " Statie160");

        FlyweightAutobuz flyweightAutobuz = new FlyweightAutobuz();

        AutobuzLinie autobuzLinie1 = flyweightAutobuz.getAutobuz("abc123", "2013", 200);
        autobuzLinie1.descriere(optionale1);
        autobuzLinie1.descriere(optionale2);
        autobuzLinie1.descriere(optionale3);
        System.out.println("------------------------------");
        AutobuzLinie autobuzLinie2 = flyweightAutobuz.getAutobuz("abc123", "2026", 150);
        autobuzLinie2.descriere(optionale1);
        autobuzLinie2.descriere(optionale2);
        autobuzLinie2.descriere(optionale3);

    }
}
