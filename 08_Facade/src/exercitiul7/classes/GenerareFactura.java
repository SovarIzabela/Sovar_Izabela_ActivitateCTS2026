package exercitiul7.classes;

public class GenerareFactura {


    private String serieFactura;
    private String dataFactura;

    public GenerareFactura(String serieFactura, String dataFactura) {
        this.serieFactura = serieFactura;
        this.dataFactura = dataFactura;
    }

    public void generareFactura(){
        System.out.println("S-a generat factura " + this.serieFactura);
    }


}
