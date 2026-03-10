package FactoryMethod.Exercitiul3.Classes;

public class Durere extends AMedicament {
    public Durere(String denumire, float pret) {
        super(denumire, pret);
    }

    public Durere() {

    }

    @Override
    public void descriere() {
        System.out.println("Acesta este un medicament de Durere");
    }
}
