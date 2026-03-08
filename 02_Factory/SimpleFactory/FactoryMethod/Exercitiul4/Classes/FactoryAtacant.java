package FactoryMethod.Exercitiul4.Classes;

public class FactoryAtacant implements IFactory{
    @Override
    public Isportiv getSportiv(String numeSportiv, int varsta, int numarTricou, String echipa, String liga) {
        return new Atacant( numeSportiv, varsta, numarTricou, echipa, liga);
    }
}
