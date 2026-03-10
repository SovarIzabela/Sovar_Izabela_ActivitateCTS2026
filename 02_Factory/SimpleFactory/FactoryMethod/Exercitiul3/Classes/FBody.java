package FactoryMethod.Exercitiul3.Classes;

public class FBody implements IFactory {
    @Override
    public AMedicament creazaMedicament(String denumire, float pret) {
        return new Body( denumire, pret);
    }
}
