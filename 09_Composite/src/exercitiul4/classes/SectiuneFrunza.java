package exercitiul4.classes;

public class SectiuneFrunza implements Isectiune{

    private String numeFrunza;

    public SectiuneFrunza(String numeFrunza) {
        this.numeFrunza = numeFrunza;
    }


    @Override
    public void adaugaNod(Isectiune nod) throws Exception {
        throw new Exception("Acesta este un nod frunza");
    }

    @Override
    public void getNod(int index) throws Exception {
        throw new Exception("Acesta este un nod frunza");
    }

    @Override
    public void stergeNod(Isectiune nod) throws Exception {
        throw new Exception("Acesta este un nod frunza");
    }

    @Override
    public void descriere(String indent) {
        System.out.println(indent + "Subsectiunea ->" + numeFrunza);
    }

    @Override
    public String toString() {
        return "SectiuneFrunza{" +
                "numeFrunza='" + numeFrunza + '\'' +
                '}';
    }
}
