package FactoryMethod.Exercitiul3.Classes;

public class Body extends AMedicament {

    public Body(String denumire, float pret) {
        super(denumire, pret);
    }

    public Body() {

    }

    @Override
    public void descriere() {
        System.out.println("Acesta este un medicament Body");

    }
}
