package Exercitiul1.Main;

import Exercitiul1.Classes.ANotaDePlata;
import Exercitiul1.Classes.Inota;
import Exercitiul1.Classes.NotaDePlata;
import Exercitiul1.Classes.NotaDecorata;

public class Main {

    public static void main(String[] args){


        Inota nota = new NotaDePlata("Iza" , 450.0f);
        nota.printeazaNota();

        ANotaDePlata notaDecorata = new NotaDecorata(nota);
        notaDecorata.printeazaFelicitare();


    }

}
