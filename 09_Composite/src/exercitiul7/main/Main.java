package exercitiul7.main;

import exercitiul7.classes.CategorieProduse;
import exercitiul7.classes.Frunza;
import exercitiul7.classes.IProduse;

public class Main {


    public static void main(String[] args){

        IProduse produs1 = new Frunza("frigider beko");
        IProduse produs2 = new Frunza("frigider arctic");
        IProduse produs3 = new Frunza("masina spalat beko");
        IProduse produs4 = new Frunza("masina spalat indesit");


        IProduse categorie1 = new CategorieProduse("Electrocasnice");
        IProduse categorie2 = new CategorieProduse("Masini Spalat");
        IProduse categorie3 = new CategorieProduse("Frigidere");

        categorie1.adaugaNod(categorie2);
        categorie1.adaugaNod(categorie3);

        categorie2.adaugaNod(produs3);
        categorie2.adaugaNod(produs4);

        categorie3.adaugaNod(produs1);
        categorie3.adaugaNod(produs2);

        categorie1.descriere(" ");


    }
}
