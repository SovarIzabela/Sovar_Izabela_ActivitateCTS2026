package exercitiul9.classes;

public class SoftExistent implements IsoftExistent{

    private String numeClient;
    private float valoare;

    public SoftExistent(String numeClient, float valoare) {
        this.numeClient = numeClient;
        this.valoare = valoare;
    }

    @Override
    public void platesteOnline() {
        System.out.println(numeClient + " a platit comanda in valoare de " + valoare);
    }


    @Override
    public String toString() {
        return "SoftExistent{" +
                "numeClient='" + numeClient + '\'' +
                ", valoare=" + valoare +
                '}';
    }
}
