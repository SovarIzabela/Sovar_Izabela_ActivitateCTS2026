package exercitiul2.main;

import exercitiul2.module.ISectiune;
import exercitiul2.module.SectiuneComposite;
import exercitiul2.module.SectiuneFrunza;

public class Main {

    public static void main(String [] args) throws Exception {

        ISectiune sectiune1 = new SectiuneComposite("Raceala");
        ISectiune sectiune2 = new SectiuneComposite("Durere");
        ISectiune sectiune3 = new SectiuneComposite("Antibiotice");

        ISectiune frunza1 = new SectiuneFrunza("Nurofen");
        ISectiune frunza2 = new SectiuneFrunza("Ibuprofen");
        ISectiune frunza3 = new SectiuneFrunza("Algocalmin");
        ISectiune frunza4 = new SectiuneFrunza("Fervex");
        ISectiune frunza5 = new SectiuneFrunza("Coldrex");
        ISectiune frunza6 = new SectiuneFrunza("Panadol");
        ISectiune frunza7 = new SectiuneFrunza("Amoxicilina");
        ISectiune frunza8 = new SectiuneFrunza("Augumentin");
        ISectiune frunza9 = new SectiuneFrunza("Ampicilina");

        sectiune1.adaugaNod(frunza4);
        sectiune1.adaugaNod(frunza6);
        sectiune1.adaugaNod(frunza5);

        sectiune2.adaugaNod(frunza1);
        sectiune2.adaugaNod(frunza2);
        sectiune2.adaugaNod(frunza3);

        sectiune3.adaugaNod(frunza7);
        sectiune3.adaugaNod(frunza8);
        sectiune3.adaugaNod(frunza9);

        sectiune1.descriere(" ");
        sectiune2.descriere(" ");
        sectiune3.descriere(" ");


    }
}
