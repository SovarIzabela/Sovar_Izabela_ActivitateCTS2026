package exercitiul6.main;

import exercitiul6.classes.*;

public class Main {

    public static void main(String[] args){

        Imetrou imetrou = new Metrou("unirii", 5);
        imetrou.valideazaCalatorieMetrou();

        Istb stb = new STBexistent("137", "autobuz", true);
        stb.valideazaCalatorieSTB();

        Istb calatorie = new Adapter(imetrou);
        calatorie.valideazaCalatorieSTB();


    }
}
