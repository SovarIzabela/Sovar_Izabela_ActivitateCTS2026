package exercitiul4.classes;

public class Certificat implements Icertificat {

    private String serieCertificat;
    private String numeBeneficiar;
    private String dataEmiterii;

    public Certificat(String serieCertificat, String numeBeneficiar, String dataEmiterii) {
        this.serieCertificat = serieCertificat;
        this.numeBeneficiar = numeBeneficiar;
        this.dataEmiterii = dataEmiterii;
    }

    public String getNumeBeneficiar() {
        return numeBeneficiar;
    }

    @Override
    public String toString() {
        return "Certificat{" +
                "serieCertificat='" + serieCertificat + '\'' +
                ", numeBeneficiar='" + numeBeneficiar + '\'' +
                ", dataEmiterii='" + dataEmiterii + '\'' +
                '}';
    }

    @Override
    public void emiteCertificat() {
        System.out.println("S-a emis certificatul pentru -> " + numeBeneficiar);
    }
}
