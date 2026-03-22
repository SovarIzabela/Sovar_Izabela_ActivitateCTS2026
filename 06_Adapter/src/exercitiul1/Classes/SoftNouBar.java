package exercitiul1.Classes;

public class SoftNouBar implements IsoftNouBar{

    private String produs;
    private int cantitate;
    private int pret;

    public SoftNouBar(String produs, int cantitate, int pret) {
        this.produs = produs;
        this.cantitate = cantitate;
        this.pret = pret;
    }

    @Override
    public void emiteNota() {

        System.out.println("S-a emis nota pentru :" + produs);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SoftNouBar{");
        sb.append("produs='").append(produs).append('\'');
        sb.append(", cantitate=").append(cantitate);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
