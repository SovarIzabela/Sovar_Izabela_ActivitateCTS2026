package exercitiul7.classes;

public class MedicamentSpital implements ImedicamentSpital{

    private String numeMedicament;
    private boolean esteNecesaraReteta;
    private float pretMed;

    public MedicamentSpital(boolean esteNecesaraReteta, float pretMed, String numeMedicament) {
        this.esteNecesaraReteta = esteNecesaraReteta;
        this.pretMed = pretMed;
        this.numeMedicament = numeMedicament;
    }

    @Override
    public void achizitioneazaMedicament() {
        if(prezintaReteta()==true){
            System.out.println("S-a achizitionat medicamentul!");
        }else{
            System.out.println("Nu se poate achizitiona medicamentul fara reteta!");
        }
    }

    @Override
    public boolean prezintaReteta() {
        return esteNecesaraReteta;
    }

    @Override
    public String toString() {
        return "MedicamentSpital{" +
                "numeMedicament='" + numeMedicament + '\'' +
                ", esteNecesaraReteta=" + esteNecesaraReteta +
                ", pretMed=" + pretMed +
                '}';
    }
}
