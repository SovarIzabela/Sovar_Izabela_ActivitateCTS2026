package FactoryMethod.Exercitiul3.Classes;

public class Raceala extends AMedicament {
    public Raceala(String denumire, float pret) {
        super(denumire, pret);
    }

    public Raceala() {
        super();
    }

    @Override
    public void descriere() {
        System.out.println("Acesta este un medicament de raceala");
    }
}
