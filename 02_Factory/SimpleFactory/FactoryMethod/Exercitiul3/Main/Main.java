package FactoryMethod.Exercitiul3.Main;

import FactoryMethod.Exercitiul3.Classes.*;

public class Main {

    public static void main(String[] args){

        IFactory factoryBody = new FBody();
        IFactory factoryRaceala = new FRaceala();
        IFactory factoryDurere = new FDurere();

        AMedicament medicament1 = factoryDurere.creazaMedicament("Medicament1" , 25.5f);
        AMedicament medicament2 = factoryRaceala.creazaMedicament("Medicament2" , 25.5f);
        AMedicament medicament3 = factoryBody.creazaMedicament("Medicament3" , 25.5f);

        medicament1.descriere();
        medicament2.descriere();
        medicament3.descriere();



    }
}
