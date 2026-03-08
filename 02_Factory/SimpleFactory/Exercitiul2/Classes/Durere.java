package Exercitiul2.Classes;

public class Durere extends AMedicament {



    public Durere(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void descriere() {
        System.out.println("Acesta este un medicament de durere");
    }
}



