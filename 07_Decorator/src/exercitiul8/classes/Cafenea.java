package exercitiul8.classes;

public class Cafenea implements Icafenea{

    private int idComanda;
    private float valoare;

    public Cafenea(int idComanda, float valoare) {
        this.idComanda = idComanda;
        this.valoare = valoare;
    }

    @Override
    public void emiteBon(float valoare) {
        System.out.println("S-a emis bonul fiscal in valoare de : " + valoare);
    }

    public int getIdComanda() {
        return idComanda;
    }

    public float getValoare() {
        return valoare;
    }
}
