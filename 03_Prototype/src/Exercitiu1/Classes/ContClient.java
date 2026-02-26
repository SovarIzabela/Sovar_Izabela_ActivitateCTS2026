package Exercitiu1.Classes;

public class ContClient implements IContClient{

    private String nume;
    private int id;

    public ContClient(String nume, int id) {
        this.nume = nume;
        this.id = id;
    }

    public ContClient() {
    }

    @Override
    public IContClient copiaza() {

        IContClient clona = new ContClient();

        ((ContClient)clona).nume = this.nume;
        ((ContClient)clona).id = this.id;

        return clona;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContClient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
