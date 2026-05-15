package exercitiul10.classes;

public class Ruta {


    private String denumire;

    private AbstractAlgoritmRuta ruta;

    public Ruta(String denumire) {
        this.denumire = denumire;
        this.ruta = new AlgoritmStatiiMinime();
    }

    public Ruta(String denumire, AbstractAlgoritmRuta ruta) {
        this.denumire = denumire;
        this.ruta = ruta;
    }

    public Ruta(AbstractAlgoritmRuta ruta) {
        this.ruta = ruta;
    }





    public void setRuta(AbstractAlgoritmRuta ruta) {
        this.ruta = ruta;
    }

    public Ruta calculeazaRuta(ReteaTransport retea, String statieStart, String statieFinal) {
        return ruta.calculeazaRuta(retea, statieStart, statieFinal);
    }


}
