package exercitiul2.Classes;

public abstract class AMedicament {

    protected String denumire;
    protected float pret;

    public abstract void descriere();


    public AMedicament(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }
}
