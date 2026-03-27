package exercitiul2.module;

public class SectiuneFrunza implements ISectiune{

    private String numeMedicament;

    public SectiuneFrunza(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    @Override
    public void adaugaNod(ISectiune sectiune) throws Exception {
        throw new Exception("Este un nod frunza");
    }

    @Override
    public void getNod(int index) throws Exception {
        throw new Exception("Este un nod frunza");
    }

    @Override
    public void stergenod(ISectiune sectiune) throws Exception {
        throw new Exception("Este un nod frunza");
    }

    @Override
    public void descriere(String indent) {
        System.out.println(indent + "-----" + numeMedicament);
    }


}
