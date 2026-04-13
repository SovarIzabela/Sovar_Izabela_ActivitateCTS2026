package exercitiul4.Classes;

public class Fundas implements ISportiv{


    private String numeSportiv;
    private int varsta;
    private int numarTricou;
    private String echipa;
    private String liga;

    public Fundas(String numeSportiv, int varsta, int numarTricou, String liga, String echipa) {
        this.numeSportiv = numeSportiv;
        this.varsta = varsta;
        this.numarTricou = numarTricou;
        this.liga = liga;
        this.echipa = echipa;
    }

    @Override
    public void descriere() {
        System.out.println("Acesta este un fundas");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fundas{");
        sb.append("numeSportiv='").append(numeSportiv).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", numarTricou=").append(numarTricou);
        sb.append(", echipa='").append(echipa).append('\'');
        sb.append(", liga='").append(liga).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
