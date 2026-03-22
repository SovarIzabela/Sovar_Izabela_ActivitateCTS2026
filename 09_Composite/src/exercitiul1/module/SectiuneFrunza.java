package exercitiul1.module;

public class SectiuneFrunza implements Isectiune {

    private String numeArticol;

    public SectiuneFrunza(String numeArticol) {
        this.numeArticol = numeArticol;
    }

    @Override
    public void adaugaNod(Isectiune nod) throws Exception {
        throw new Exception("Este un nod frunza!");
    }

    @Override
    public void getNod(int index) throws Exception {
        throw new Exception("Este un nod frunza!");
    }

    @Override
    public void stergeNod(Isectiune nod) throws Exception {
        throw new Exception("Este un nod frunza!");
    }

    @Override
    public void descriere(String indent) throws Exception {
        System.out.println(indent + "---" + "Articolul este -> " + numeArticol);
    }
}
