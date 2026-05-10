package exercitiul7.classes;

public class Frunza implements IProduse{

    private String nume;

    public Frunza(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaNod(IProduse produse) {
        throw new UnsupportedOperationException("Acesta este un nod frunza!");
    }

    @Override
    public void stergeNod(IProduse produse) {
        throw new UnsupportedOperationException("Acesta este un nod frunza!");
    }

    @Override
    public IProduse getProdus(int index) {
        throw new UnsupportedOperationException("Acesta este un nod frunza!");
    }

    @Override
    public void descriere(String indent) {
        System.out.println(indent + this.nume);
    }
}
