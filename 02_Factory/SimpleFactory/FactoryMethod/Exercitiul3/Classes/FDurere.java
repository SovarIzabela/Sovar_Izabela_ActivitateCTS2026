package FactoryMethod.Exercitiul3.Classes;

public class FDurere implements IFactory{
    @Override
    public AMedicament creazaMedicament(String denumire, float pret) {
        return new Durere(denumire,  pret);
    }


}
