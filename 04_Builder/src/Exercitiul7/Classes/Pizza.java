package Exercitiul7.Classes;

public class Pizza {

    private String tipAluat;
    private int dimensiune;
    private boolean extraBranza;
    private boolean areMasline;
    private boolean areSosPicant;

    public Pizza(String tipAluat, int dimensiune, boolean extraBranza, boolean areMasline, boolean areSosPicant) {
        this.tipAluat = tipAluat;
        this.dimensiune = dimensiune;
        this.extraBranza = extraBranza;
        this.areMasline = areMasline;
        this.areSosPicant = areSosPicant;
    }

    public void setTipAluat(String tipAluat) {
        this.tipAluat = tipAluat;
    }

    public void setDimensiune(int dimensiune) {
        this.dimensiune = dimensiune;
    }

    public void setExtraBranza(boolean extraBranza) {
        this.extraBranza = extraBranza;
    }

    public void setAreMasline(boolean areMasline) {
        this.areMasline = areMasline;
    }

    public void setAreSosPicant(boolean areSosPicant) {
        this.areSosPicant = areSosPicant;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pizza{");
        sb.append("tipAluat='").append(tipAluat).append('\'');
        sb.append(", dimensiune=").append(dimensiune);
        sb.append(", extraBranza=").append(extraBranza);
        sb.append(", areMasline=").append(areMasline);
        sb.append(", areSosPicant=").append(areSosPicant);
        sb.append('}');
        return sb.toString();
    }
}
