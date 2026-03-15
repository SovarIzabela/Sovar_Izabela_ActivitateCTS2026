package Exercitiul6.Classes;

import java.util.ArrayList;

public class Builder implements IBuilder{

    private MasinaPersonalizata masinaPersonalizata;

    public Builder(String marca, String sasiu) {
        masinaPersonalizata = new MasinaPersonalizata(marca, sasiu, new ArrayList<>(), false,false, false);
    }

    public Builder setMesajeDecorativeGeam(boolean mesajeDecorativeGeam) {
        this.masinaPersonalizata.setMesajeDecorativeGeam(mesajeDecorativeGeam);
        return this;
    }

    public Builder setMesajegeam(boolean mesajegeam) {
        this.masinaPersonalizata.setMesajegeam(mesajegeam);
        return this;
    }

    public Builder setMesajePortiere(boolean mesajePortiere) {
        this.masinaPersonalizata.setMesajePortiere(mesajePortiere);
        return this;

    }

    @Override
    public MasinaPersonalizata build() {
        return masinaPersonalizata;
    }
}
