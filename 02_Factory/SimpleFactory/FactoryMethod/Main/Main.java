package FactoryMethod.Main;

import FactoryMethod.Classes.*;

public class Main {

    public static void main(String[] args) {

        FsupaCiuperci fsc = new FsupaCiuperci();
        FsupaLegume fsl = new FsupaLegume();
        FsupaPui fsp = new FsupaPui();
        FsupaVita fsv = new FsupaVita();

        Supa s1 = fsc.intoarceSupa("Ciuperci" , 50, 120);
        Supa s2 = fsl.intoarceSupa("Legume", 50, 50);
        Supa s3 = fsp.intoarceSupa("Pui", 50, 50);
        Supa s4 = fsv.intoarceSupa("Vita", 70, 300);

        s1.descriere();



    }

}