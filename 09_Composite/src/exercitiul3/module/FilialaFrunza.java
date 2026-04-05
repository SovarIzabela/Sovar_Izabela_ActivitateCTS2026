package exercitiul3.module;

public class FilialaFrunza implements ISucursala{

    private String numeFiliala;

    public FilialaFrunza(String numeFiliala) {
        this.numeFiliala = numeFiliala;
    }

    @Override
    public void adaugaNod(ISucursala nod) throws Exception {
        throw new Exception("Acesta este un nod frunza");
    }

    @Override
    public void getNod(int index) throws Exception {
        throw new Exception("Acesta este un nod frunza");
    }

    @Override
    public void stergeNod(ISucursala nod) throws Exception {
        throw new Exception("Acesta este un nod frunza");
    }

    @Override
    public void descriere(String indent) {
        System.out.println(indent+"->" + numeFiliala);
    }
}
