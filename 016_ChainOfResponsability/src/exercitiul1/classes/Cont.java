package exercitiul1.classes;

public class Cont {

    private String numeBeneficiar;
    private String banca;
    private double suma;

    public Cont(String numeBeneficiar, String banca, double suma) {
        this.numeBeneficiar = numeBeneficiar;
        this.banca = banca;
        this.suma = suma;
    }

    public String getNumeBeneficiar() {
        return numeBeneficiar;
    }

    public String getBanca() {
        return banca;
    }

    public double getSuma() {
        return suma;
    }
}
