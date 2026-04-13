package exercitiul4.Classes;

public class Atacant implements ISportiv{


    private String numeSportiv;
    private int varsta;
    private int numarTricou;
    private String echipa;
    private String liga;


    public Atacant(String numeSportiv, String echipa, int numarTricou, int varsta, String liga) {
        this.numeSportiv = numeSportiv;
        this.echipa = echipa;
        this.numarTricou = numarTricou;
        this.varsta = varsta;
        this.liga = liga;
    }

    @Override
    public void descriere() {
        System.out.println("Acesta este un atacant!");
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
