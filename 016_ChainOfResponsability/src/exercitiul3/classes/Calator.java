package exercitiul3.classes;

public class Calator  {

    private String nume;
    private int varsta;
    private int distanta;

    public Calator(String nume, int varsta, int distanta) {
        this.nume = nume;
        this.varsta = varsta;
        this.distanta = distanta;
    }


    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public int getDistanta() {
        return distanta;
    }
}
