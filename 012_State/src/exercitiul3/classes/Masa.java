package exercitiul3.classes;

public class Masa {

    private int nrMasa;
    private int numarPersoane;
    private String  numeRestaurant;
    private State state;

    public Masa(int nrMasa, int numarPersoane, String numeRestaurant) {
        this.nrMasa = nrMasa;
        this.numarPersoane = numarPersoane;
        this.numeRestaurant = numeRestaurant;
        this.state = null;
    }


    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Masa{" +
                "nrMasa=" + nrMasa +
                ", numarPersoane=" + numarPersoane +
                ", numeRestaurant='" + numeRestaurant + '\'' +
                ", state=" + state +
                '}';
    }
}
