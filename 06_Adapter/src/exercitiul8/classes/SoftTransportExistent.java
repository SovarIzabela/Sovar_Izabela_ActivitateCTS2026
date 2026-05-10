package exercitiul8.classes;

public class SoftTransportExistent implements IsoftExistent{

    private float costPachet1;
    private float asigurareTransport;

    public SoftTransportExistent(float costPachet1, float asigurareTransport) {
        this.costPachet1 = costPachet1;
        this.asigurareTransport = asigurareTransport;
    }

    public float getCostPachet1() {
        return costPachet1;
    }

    public float getAsigurareTransport() {
        return asigurareTransport;
    }

    @Override
    public float calculeazaCost() {
        return costPachet1+asigurareTransport*costPachet1;
    }





}
