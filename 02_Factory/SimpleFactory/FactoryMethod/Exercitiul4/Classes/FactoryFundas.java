package FactoryMethod.Exercitiul4.Classes;

public class FactoryFundas implements IFactory{
    @Override
    public Isportiv getSportiv(String numeSportiv, int varsta, int numarTricou, String echipa, String liga) {
        return new Fundas( numeSportiv, varsta, numarTricou, echipa, liga);
    }
}
