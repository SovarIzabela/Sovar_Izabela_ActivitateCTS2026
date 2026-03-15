package FactoryMethod.Exercitiul7.Classes;



import java.util.ArrayList;
import java.util.List;

public class TunningSport extends AMasina {

    public TunningSport(String marca, String sasiu, List<String> listaServiciiTunning) {
        this.marca = marca;
        this.sasiu = sasiu;
        this.listaServiciiTunning = new ArrayList<>(listaServiciiTunning);
    }
    @Override
    public void addServiciu(String serviciu) {
        listaServiciiTunning.add(serviciu);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TunningSport{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", sasiu='").append(sasiu).append('\'');
        sb.append(", listaServiciiTunning=").append(listaServiciiTunning);
        sb.append('}');
        return sb.toString();
    }
}
