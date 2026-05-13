package exercitiul9.classes;

public class Adapter implements IsoftExistent{


    private ISoftExtern softExtern;

    public Adapter(ISoftExtern softExtern) {
        this.softExtern = softExtern;
    }

    @Override
    public void platesteOnline() {
        softExtern.efectueazaPlata();
    }

    @Override
    public String toString() {
        return "Adapter{" +
                "softExtern=" + softExtern +
                '}';
    }
}
