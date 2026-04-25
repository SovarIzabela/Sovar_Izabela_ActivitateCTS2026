package exercitiul2.classes;

public class Reteta implements Istare{

    private String numarReteta;
    private String numePacient;
    private boolean esteCompensata;
    private int numarMedicamente;
    private Istare stare;

    public Reteta(String numarReteta, String numePacient, boolean esteCompensata, int numarMedicamente) {
        this.numarReteta = numarReteta;
        this.numePacient = numePacient;
        this.esteCompensata = esteCompensata;
        this.numarMedicamente = numarMedicamente;
        this.stare = null;
    }

    public String getNumarReteta() {
        return numarReteta;
    }

    public void setNumarReteta(String numarReteta) {
        this.numarReteta = numarReteta;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public boolean isEsteCompensata() {
        return esteCompensata;
    }

    public void setEsteCompensata(boolean esteCompensata) {
        this.esteCompensata = esteCompensata;
    }

    public int getNumarMedicamente() {
        return numarMedicamente;
    }

    public void setNumarMedicamente(int numarMedicamente) {
        this.numarMedicamente = numarMedicamente;
    }

    public Istare getStare() {
        return stare;
    }

    public void setStare(Istare stare) {
        this.stare = stare;
    }

    @Override
    public void doAction(Reteta reteta) {

    }
}
