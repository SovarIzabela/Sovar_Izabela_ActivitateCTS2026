package Exercitiul6.Classes;

import java.util.ArrayList;
import java.util.List;

public class MasinaPersonalizata extends AMasina{

    private boolean mesajeDecorativeGeam;
    private boolean mesajegeam;
    private boolean mesajePortiere;

    public MasinaPersonalizata(String marca, String sasiu, List<String> listaServiciiTunning, boolean mesajeDecorativeGeam, boolean mesajegeam, boolean mesajePortiere) {
        this.marca = marca;
        this.sasiu = sasiu;
        this.listaServiciiTunning = new ArrayList<>(listaServiciiTunning);
        this.mesajeDecorativeGeam = mesajeDecorativeGeam;
        this.mesajegeam = mesajegeam;
        this.mesajePortiere = mesajePortiere;
    }

    public void setMesajeDecorativeGeam(boolean mesajeDecorativeGeam) {
        this.mesajeDecorativeGeam = mesajeDecorativeGeam;
    }

    public void setMesajegeam(boolean mesajegeam) {
        this.mesajegeam = mesajegeam;
    }

    public void setMesajePortiere(boolean mesajePortiere) {
        this.mesajePortiere = mesajePortiere;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MasinaPersonalizata{");
        sb.append("mesajeDecorativeGeam=").append(mesajeDecorativeGeam);
        sb.append(", mesajegeam=").append(mesajegeam);
        sb.append(", mesajePortiere=").append(mesajePortiere);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", sasiu='").append(sasiu).append('\'');
        sb.append(", listaServiciiTunning=").append(listaServiciiTunning);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void addServiciu(String serviciu) {
        listaServiciiTunning.add(serviciu);
    }
}
