package FactoryMethod.Exercitiul4.Classes;

public class Portar implements Isportiv{

    private String numeSportiv;
    private int varsta;
    private int numarTricou;
    private String echipa;
    private String liga;

    public Portar(String numeSportiv, int varsta, int numarTricou, String echipa, String liga) {
        this.numeSportiv = numeSportiv;
        this.varsta = varsta;
        this.numarTricou = numarTricou;
        this.echipa = echipa;
        this.liga = liga;
    }


    @Override
    public void descriere() {
        System.out.println("Portar");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Portar{");
        sb.append("numeSportiv='").append(numeSportiv).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", numarTricou=").append(numarTricou);
        sb.append(", echipa='").append(echipa).append('\'');
        sb.append(", liga='").append(liga).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
