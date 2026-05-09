package exercitiul7.classes;

public class Adapter implements ImedicamentFarmacie{

    private ImedicamentSpital medSpital ;

    public Adapter(ImedicamentSpital medSpital) {
        this.medSpital = medSpital;
    }

    @Override
    public void cumparaMedicament() {
        medSpital.achizitioneazaMedicament();
    }
}
