package FactoryMethod.Exercitiul2.Classes;

public abstract class AClient {

    protected String numeClient;
    private static int contorID;
    protected int id;

    public AClient(String numeClient) {
        this.numeClient = numeClient;
        this.id = ++contorID;
    }

    public abstract void descriereClient();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AClient{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
