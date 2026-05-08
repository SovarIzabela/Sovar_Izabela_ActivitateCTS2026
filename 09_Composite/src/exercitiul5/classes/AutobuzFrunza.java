package exercitiul5.classes;

public class AutobuzFrunza implements IFlotaAutobuz{

    private String producator;
    private String model;
    private int numarLcuri;

    public AutobuzFrunza(String producator, String model, int numarLcuri) {
        this.producator = producator;
        this.model = model;
        this.numarLcuri = numarLcuri;
    }

    @Override
    public void adaugaNod(IFlotaAutobuz flotaAutobuz) {
        throw new UnsupportedOperationException("Este un nod frunza");
    }

    @Override
    public void stergeNod(IFlotaAutobuz flotaAutobuz) {
        throw new UnsupportedOperationException("Este un nod frunza");
    }

    @Override
    public IFlotaAutobuz getNod(int index) {
        throw new UnsupportedOperationException("Este un nod frunza");
    }

    @Override
    public void descriere(String indent) {
        System.out.println(indent + "Autobuz modelul " + model + ", producator " + producator + " numar Locuri" + numarLcuri);
    }



}
