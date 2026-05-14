package exercitiul9.classes;

public class Frunza implements  IUniversitate{

    private String denumire;

    public Frunza(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugaNod(IUniversitate universitate) {
        throw new UnsupportedOperationException("Este un nod frunza!");
    }

    @Override
    public void stergeNod(IUniversitate universitate) {
        throw new UnsupportedOperationException("Este un nod frunza!");
    }

    @Override
    public IUniversitate getNod(int index) {
        throw new UnsupportedOperationException("Este un nod frunza!");
    }

    @Override
    public void descriere(String indent) {
        System.out.println(indent + " " + denumire);
    }
}
