package exercitiul5.classes;

public class Client {

    private String numeClient;
    private int sumaSolicitata;

    public Client(String numeClient, int sumaSolicitata) {
        this.numeClient = numeClient;
        this.sumaSolicitata = sumaSolicitata;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public int getSumaSolicitata() {
        return sumaSolicitata;
    }
}
