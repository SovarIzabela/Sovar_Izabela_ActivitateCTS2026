package exercitiul7.classes;

public class MedicamentFarmacie implements ImedicamentFarmacie{
    private String numeFarmacie;
    private String numeMedicament;
    private int pret;


    public MedicamentFarmacie(String numeFarmacie, String numeMedicament, int pret) {
        this.numeFarmacie = numeFarmacie;
        this.numeMedicament = numeMedicament;
        this.pret = pret;
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("S-a cumaparat mediacamntul "+ numeMedicament + " din farmacia: " + numeFarmacie);
    }
}
