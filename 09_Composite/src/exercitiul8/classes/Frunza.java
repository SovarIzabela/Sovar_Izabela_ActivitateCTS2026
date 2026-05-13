package exercitiul8.classes;

public class Frunza implements IFirma{

    private String nume;

    public Frunza(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaNod(IFirma firma) {
        throw new UnsupportedOperationException("Acesta este un nod frunza!");
    }

    @Override
    public void stergeNod(IFirma firma) {
        throw new UnsupportedOperationException("Acesta este un nod frunza!");
    }

    @Override
    public IFirma getNod(int index) {
        throw new UnsupportedOperationException("Acesta este un nod frunza!");
    }

    @Override
    public void descriere(String indent) {
        System.out.println(indent + "-> " + nume);
    }
}
