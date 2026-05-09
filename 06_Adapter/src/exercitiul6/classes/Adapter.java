package exercitiul6.classes;

public class Adapter implements Istb{

    private Imetrou metrou;

    public Adapter(Imetrou metrou) {
        this.metrou = metrou;
    }

    @Override
    public void valideazaCalatorieSTB() {
        metrou.valideazaCalatorieMetrou();
    }

    @Override
    public String toString() {
        return "Adapter{" +
                "metrou=" + metrou +
                '}';
    }
}
