package exercitiul4.main;

import exercitiul4.classes.Isectiune;
import exercitiul4.classes.SectiuneFrunza;
import exercitiul4.classes.SectiuneNod;

public class Main {
    public static void main(String [] args) throws Exception {

        Isectiune sectiune1 = new SectiuneNod("Tribuna");
        Isectiune sectiune2 = new SectiuneNod("Peluza");

        Isectiune frunza1 = new SectiuneFrunza("Tribuna Nord");
        Isectiune frunza2 = new SectiuneFrunza("Tribuna Sud");
        Isectiune frunza3 = new SectiuneFrunza("Tribuna Copii");
        Isectiune frunza4 = new SectiuneFrunza("Tribuna Vip");
        Isectiune frunza5 = new SectiuneFrunza("Peluza Vip");
        Isectiune frunza6 = new SectiuneFrunza("Peluza Copii");
        Isectiune frunza7 = new SectiuneFrunza("Peluza Nord");
        Isectiune frunza8 = new SectiuneFrunza("Peluza Sud");


        sectiune1.adaugaNod(frunza1);
        sectiune1.adaugaNod(frunza2);
        sectiune1.adaugaNod(frunza3);
        sectiune1.adaugaNod(frunza4);

        sectiune2.adaugaNod(frunza5);
        sectiune2.adaugaNod(frunza6);
        sectiune2.adaugaNod(frunza7);
        sectiune2.adaugaNod(frunza8);

        sectiune1.descriere("   ");

        sectiune2.descriere("  ");

    }
}
