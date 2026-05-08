package exercitiul6.classes;

public class Optionale {

    private int numarLinie;
    private String primaStatie;
    private String ultimaStatie;


    public Optionale(int numarLinie, String primaStatie, String ultimaStatie) {
        this.numarLinie = numarLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public String toString() {
        return "Optionale{" +
                "numarLinie=" + numarLinie +
                ", primaStatie='" + primaStatie + '\'' +
                ", ultimaStatie='" + ultimaStatie + '\'' +
                '}';
    }
}
