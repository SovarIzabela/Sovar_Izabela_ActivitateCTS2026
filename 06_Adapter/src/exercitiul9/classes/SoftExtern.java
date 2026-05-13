package exercitiul9.classes;

public class SoftExtern implements ISoftExtern{

    private int idComanda;
    private float valoareComanda;

    public SoftExtern(int idComanda, float valoareComanda) {
        this.idComanda = idComanda;
        this.valoareComanda = valoareComanda;
    }

    @Override
    public void efectueazaPlata() {
        System.out.println("S-a efectat plata comenzii in valoare de : " + valoareComanda);
    }


    @Override
    public String toString() {
        return "SoftExtern{" +
                "idComanda=" + idComanda +
                ", valoareComanda=" + valoareComanda +
                '}';
    }
}
