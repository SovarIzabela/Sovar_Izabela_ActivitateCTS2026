package exercitiul8.classes;

public class AdapterTransport implements IsoftExistent{

    private ISoftExtern softExtern;

    public AdapterTransport(ISoftExtern softExtern) {
        this.softExtern = softExtern;
    }

    @Override
    public float calculeazaCost() {
        return softExtern.getShippingPrice();
    }
}
