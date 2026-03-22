package exercitiul1.main;

import exercitiul1.Classes.ANotaDePlata;
import exercitiul1.Classes.Inota;
import exercitiul1.Classes.NotaDePlata;
import exercitiul1.Classes.NotaDecorata;

public class Main {

    public static void main(String[] args){


        Inota nota = new NotaDePlata("Iza" , 450.0f);
        nota.printeazaNota();

        ANotaDePlata notaDecorata = new NotaDecorata(nota);
        notaDecorata.printeazaFelicitare();


    }

}
