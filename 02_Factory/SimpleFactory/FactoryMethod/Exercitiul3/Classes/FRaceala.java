package FactoryMethod.Exercitiul3.Classes;

public class FRaceala implements IFactory{
    @Override
    public AMedicament creazaMedicament(String denumire, float pret) {
        return new Raceala(denumire, pret);
    }

}
