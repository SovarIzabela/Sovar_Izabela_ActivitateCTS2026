package exercitiul2.classes;

public class Client implements IClient {

    private String numeClient;
    private String numarAsigurare;

    public Client(String numeClient, String numarAsigurare) {
        this.numeClient = numeClient;
        this.numarAsigurare = numarAsigurare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", numarAsigurare='").append(numarAsigurare).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere(Reteta reteta) {
        System.out.println(this.toString()+reteta.toString());
    }
}
