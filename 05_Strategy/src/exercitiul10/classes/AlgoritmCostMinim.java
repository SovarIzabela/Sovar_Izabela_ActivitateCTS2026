package exercitiul10.classes;

public class AlgoritmCostMinim implements AbstractAlgoritmRuta{
    @Override
    public Ruta calculeazaRuta(ReteaTransport retea, String statieStart, String statieFinal) {
        System.out.println("se recomanda ruta 2 folosind algorimtul Cost minim! ");
        return new Ruta(" ruta 2");
    }
}
