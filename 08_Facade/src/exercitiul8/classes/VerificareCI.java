package exercitiul8.classes;

public class VerificareCI {

    private String numeClient;
    private int varsta;
    private String cnp;

    public VerificareCI(String numeClient, int varsta, String cnp) {
        this.numeClient = numeClient;
        this.varsta = varsta;
        this.cnp = cnp;
    }

    public void verificareBuletin(){
        System.out.println("S-a efectuat verificarea buletinului");
    }

    @Override
    public String toString() {
        return "VerificareCI{" +
                "numeClient='" + numeClient + '\'' +
                ", varsta=" + varsta +
                ", cnp='" + cnp + '\'' +
                '}';
    }
}
