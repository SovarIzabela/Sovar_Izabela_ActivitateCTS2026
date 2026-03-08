package Exercitiul2.Classes;

public class Body extends AMedicament {



    public Body(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void descriere() {
        System.out.println("Acesta este un medicament de body");
    }
}
