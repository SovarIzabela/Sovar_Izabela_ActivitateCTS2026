package FactoryMethod.Exercitiul4.Classes;

public class FactoryPortar implements IFactory {
    @Override
    public Isportiv getSportiv(String numeSportiv, int varsta, int numarTricou, String echipa, String liga) {
        return new Portar(numeSportiv,varsta,numarTricou, echipa, liga);
    }
}
