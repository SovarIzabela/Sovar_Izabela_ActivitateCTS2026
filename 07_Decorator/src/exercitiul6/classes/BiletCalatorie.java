package exercitiul6.classes;

public class BiletCalatorie implements IBiletCalatorie{


    private String numeCompanie;
    private int pretBilet;
    private String serieBilet;

    public BiletCalatorie(String numeCompanie, int pretBilet, String serieBilet) {
        this.numeCompanie = numeCompanie;
        this.pretBilet = pretBilet;
        this.serieBilet = serieBilet;
    }

    @Override
    public void printeazaBilet() {
        System.out.println("S-a printat biletul  " + this.numeCompanie);
    }

    @Override
    public String toString() {
        return "BiletCalatorie{" +
                "numeCompanie='" + numeCompanie + '\'' +
                ", pretBilet=" + pretBilet +
                ", serieBilet='" + serieBilet + '\'' +
                '}';
    }
}
