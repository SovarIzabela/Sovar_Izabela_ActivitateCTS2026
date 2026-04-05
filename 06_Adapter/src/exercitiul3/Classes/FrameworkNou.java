package exercitiul3.Classes;

public class FrameworkNou implements IFrameworkNou{

    private String numeClient;
    private float sumaImprumutata;
    private int aniLeasing;

    public FrameworkNou(String numeClient, float sumaImprumutata, int aniLeasing) {
        this.numeClient = numeClient;
        this.sumaImprumutata = sumaImprumutata;
        this.aniLeasing = aniLeasing;
    }





    @Override
    public void acordaLeasing() {
        System.out.println("S-a acordat Leasingul");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FrameworkNou{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", sumaImprumutata=").append(sumaImprumutata);
        sb.append(", aniLeasing=").append(aniLeasing);
        sb.append('}');
        return sb.toString();
    }
}
