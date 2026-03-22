package exercitiul2.Classes;

public class Client implements IClient {

    private String numeClient;
    private String iban;

    public Client(String numeClient, String iban) {
        this.numeClient = numeClient;
        this.iban = iban;
    }

    public Client() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IClient{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", iban='").append(iban).append('\'');
        sb.append('}');
        return sb.toString();
    }


    @Override
    public IClient copiaza() {
       IClient c = new Client();
        ((Client)c).numeClient = this.numeClient;
        ((Client)c).iban = this.iban;
        return c;

    }
}
