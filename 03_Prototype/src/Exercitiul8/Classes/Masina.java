package Exercitiul8.Classes;

import java.util.ArrayList;
import java.util.List;

public class Masina extends AMasina implements Imasina{

    public Masina(String marca, String sasiu, List<String> listaMasini) {
        this.marca = marca;
        this.sasiu = sasiu;
        this.listaMasini = new ArrayList<>(listaMasini);
    }

    public Masina() {

    }


    @Override
    public void addMesaj(String masina) {
        listaMasini.add(masina);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", sasiu='").append(sasiu).append('\'');
        sb.append(", listaMasini=").append(listaMasini);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Masina copiaza() {
        Masina m1 = new Masina();
        m1.marca = this.marca;
        m1.sasiu = this.sasiu;
        m1.listaMasini = new ArrayList<>(this.listaMasini);
        return m1;
    }
}
