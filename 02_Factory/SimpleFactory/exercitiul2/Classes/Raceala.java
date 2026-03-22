package exercitiul2.Classes;

public class Raceala extends AMedicament {


    public Raceala(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void descriere() {
        System.out.println("Acesta este un medicament de raceala");
    }
}
