package exercitiul7.classes;

public class Factura implements Ifactura{


    private String serieFactura;
    private float valoareFactura;
    private String dataFacturii;

    public Factura(String serieFactura, float valoareFactura, String dataFacturii) {
        this.serieFactura = serieFactura;
        this.valoareFactura = valoareFactura;
        this.dataFacturii = dataFacturii;
    }

    @Override
    public void emiteFactura() {
        System.out.println("S-a emis factura  in valoare de " + this.valoareFactura);
    }

    @Override
    public String toString() {
        return "Factura{" +
                "serieFactura='" + serieFactura + '\'' +
                ", valoareFactura=" + valoareFactura +
                ", dataFacturii='" + dataFacturii + '\'' +
                '}';
    }
}
