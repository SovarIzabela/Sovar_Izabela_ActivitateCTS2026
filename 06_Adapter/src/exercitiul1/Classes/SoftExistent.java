package exercitiul1.Classes;

public class SoftExistent implements IsoftExistent{

    private int nrFactura;
    private float valoare;

    public SoftExistent(int nrFactura, float valoare) {
        this.nrFactura = nrFactura;
        this.valoare = valoare;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SoftExistent{");
        sb.append("nrFactura=").append(nrFactura);
        sb.append(", valoare=").append(valoare);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void printeazaFactura() {
        System.out.println("S-a printat factura cu numarul " + nrFactura+"are valoarea" + valoare);
    }
}
