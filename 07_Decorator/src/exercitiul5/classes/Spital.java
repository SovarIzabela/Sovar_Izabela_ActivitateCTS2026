package exercitiul5.classes;

public class Spital implements Ispital{

    private String numePacient;
    private int varstaPacient;

    public Spital(String numePacient, int varstaPacient) {
        this.numePacient = numePacient;
        this.varstaPacient = varstaPacient;
    }

    public String getNumePacient() {
        return numePacient;
    }

    @Override
    public void printeazaRezultat() {
        System.out.println("Rezultatele pentru pacientul "+ this.numePacient+ " au fost printate!");
    }







}
