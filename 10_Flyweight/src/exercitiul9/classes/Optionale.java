package exercitiul9.classes;

public class Optionale {

    private int pozitiax;
    private int pozitiaY;
    private int nivelViata;
    private String directia;

    public Optionale(int pozitiax, int pozitiaY, int nivelViata, String directia) {
        this.pozitiax = pozitiax;
        this.pozitiaY = pozitiaY;
        this.nivelViata = nivelViata;
        this.directia = directia;
    }

    @Override
    public String toString() {
        return "Optionale{" +
                "pozitiax=" + pozitiax +
                ", pozitiaY=" + pozitiaY +
                ", nivelViata=" + nivelViata +
                ", directia='" + directia + '\'' +
                '}';
    }
}
