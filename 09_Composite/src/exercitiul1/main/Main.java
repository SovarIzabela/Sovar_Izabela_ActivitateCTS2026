package exercitiul1.main;

import exercitiul1.module.Isectiune;
import exercitiul1.module.SectiuneComposite;
import exercitiul1.module.SectiuneFrunza;

public class Main {

    public static void main(String [] args) throws Exception {

        Isectiune sectiuneComposite1 = new SectiuneComposite("starter");
        Isectiune sectiuneFrunza1 = new SectiuneFrunza("salata");
        Isectiune sectiuneFrunza2 = new SectiuneFrunza("bruschete");

        Isectiune sectiuneComposite2 = new SectiuneComposite("bautura");
        Isectiune sectiuneFrunza3 = new SectiuneFrunza("bere");
        Isectiune sectiuneFrunza4 = new SectiuneFrunza("cola");
        Isectiune sectiuneFrunza5 = new SectiuneFrunza("apa");

        Isectiune sectiuneComposite3 = new SectiuneComposite("felPrincipal");
        Isectiune sectiuneFrunza6 = new SectiuneFrunza(" beef steak");
        Isectiune sectiuneFrunza7 = new SectiuneFrunza("sarmale");
        Isectiune sectiuneFrunza8 = new SectiuneFrunza("lasagna");

        Isectiune sectiuneComposite4 = new SectiuneComposite("desert");
        Isectiune sectiuneFrunza10 = new SectiuneFrunza("tiramisu");
        Isectiune sectiuneFrunza21 = new SectiuneFrunza("red velvet");

        sectiuneComposite1.adaugaNod(sectiuneFrunza1);
        sectiuneComposite1.adaugaNod(sectiuneFrunza2);

        sectiuneComposite2.adaugaNod(sectiuneFrunza3);
        sectiuneComposite2.adaugaNod(sectiuneFrunza4);
        sectiuneComposite2.adaugaNod(sectiuneFrunza5);

        sectiuneComposite3.adaugaNod(sectiuneFrunza6);
        sectiuneComposite3.adaugaNod(sectiuneFrunza7);
        sectiuneComposite3.adaugaNod(sectiuneFrunza8);

        sectiuneComposite4.adaugaNod(sectiuneFrunza10);
        sectiuneComposite4.adaugaNod(sectiuneFrunza21);


        sectiuneComposite1.descriere(" ");
        sectiuneComposite2.descriere(" ");
        sectiuneComposite3.descriere(" ");
        sectiuneComposite4.descriere(" ");

    }
}
