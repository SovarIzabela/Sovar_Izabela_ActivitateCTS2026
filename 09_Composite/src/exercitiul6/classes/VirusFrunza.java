package exercitiul6.classes;

public class VirusFrunza implements IVirus {

    private String numeVirus;
    private int gradRaspandire;

    public VirusFrunza(String numeVirus, int gradRaspandire) {
        this.numeVirus = numeVirus;
        this.gradRaspandire = gradRaspandire;
    }

    @Override
    public void adaugaNod(IVirus virus) {
        throw new UnsupportedOperationException("Este un nod Frunza!");
    }

    @Override
    public void stergeNod(IVirus virus) {
        throw new UnsupportedOperationException("Este un nod Frunza!");
    }

    @Override
    public void descriere(String indent) {
        System.out.println(indent + " Numele virusului:" + numeVirus + " si are un grad de raspandire de "  + gradRaspandire) ;
    }

    @Override
    public IVirus getVirus(int index) {
        throw new UnsupportedOperationException("Este un nod Frunza!");
    }
}
