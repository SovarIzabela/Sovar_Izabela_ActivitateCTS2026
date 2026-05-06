package exercitiul4.classes;

import java.util.List;

public class Autobuz implements Iautobuz{

    private int numarAutobuz;
    private String oras;
    private List<String> statii;

    public Autobuz(int numarAutobuz, String oras, List<String> statii) {
        this.numarAutobuz = numarAutobuz;
        this.oras = oras;
        this.statii = statii;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numarAutobuz=" + numarAutobuz +
                ", oras='" + oras + '\'' +
                ", statii=" + statii +
                '}';
    }

    @Override
    public void oprireStatie(String numeStatie) {
        System.out.println("Autobuzul a oprit in statia" + numeStatie);
    }


    public int getNumarAutobuz() {
        return numarAutobuz;
    }

    public String getOras() {
        return oras;
    }

    public List<String> getStatii() {
        return statii;
    }
}
