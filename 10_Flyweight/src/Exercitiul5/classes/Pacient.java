package Exercitiul5.classes;

public class Pacient implements Ipacient{

    private String numePacient;
    private String numarTelefon;
    private String adresa;
    private int varsta;


    public Pacient(String numePacient, String numarTelefon, String adresa, int varsta) {
        this.numePacient = numePacient;
        this.numarTelefon = numarTelefon;
        this.adresa = adresa;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "numePacient='" + numePacient + '\'' +
                ", numarTelefon='" + numarTelefon + '\'' +
                ", adresa='" + adresa + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    @Override
    public void descriere(Optionale optionale) {
        System.out.println(this.toString() + optionale.toString());
    }
}
