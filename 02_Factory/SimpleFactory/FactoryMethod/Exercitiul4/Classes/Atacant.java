package FactoryMethod.Exercitiul4.Classes;

public class Atacant implements Isportiv{

    private String numeSportiv;
    private int varsta;
    private int numarTricou;
    private String echipa;
    private String liga;

    public Atacant(String numeSportiv, int varsta, int numarTricou, String echipa, String liga) {
        this.numeSportiv = numeSportiv;
        this.varsta = varsta;
        this.numarTricou = numarTricou;
        this.echipa = echipa;
        this.liga = liga;
    }

    @Override
    public void descriere() {
        System.out.println("Atacant");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Atacant{");
        sb.append("numeSportiv='").append(numeSportiv).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", numarTricou=").append(numarTricou);
        sb.append(", echipa='").append(echipa).append('\'');
        sb.append(", liga='").append(liga).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
