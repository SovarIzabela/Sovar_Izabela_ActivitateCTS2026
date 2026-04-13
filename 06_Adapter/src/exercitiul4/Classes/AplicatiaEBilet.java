package exercitiul4.Classes;

public class AplicatiaEBilet implements IaplicatiaEBilet {

    private String numeClient;
    private String locatieMeci;
    private int numarLoc;
    private String echipa1;
    private String echipa2;
    private double pretBilet;

    public AplicatiaEBilet(String numeClient, String locatieMeci, int numarLoc, String echipa1, String echipa2, double pretBilet) {
        this.numeClient = numeClient;
        this.locatieMeci = locatieMeci;
        this.numarLoc = numarLoc;
        this.echipa1 = echipa1;
        this.echipa2 = echipa2;
        this.pretBilet = pretBilet;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AplicatiaEBilet{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", locatieMeci='").append(locatieMeci).append('\'');
        sb.append(", numarLoc=").append(numarLoc);
        sb.append(", echipa1='").append(echipa1).append('\'');
        sb.append(", echipa2='").append(echipa2).append('\'');
        sb.append(", pretBilet=").append(pretBilet);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void vindeBilet() {
        System.out.println("S-a vandut biletul prin aplicatia EBilet ");
    }
}
