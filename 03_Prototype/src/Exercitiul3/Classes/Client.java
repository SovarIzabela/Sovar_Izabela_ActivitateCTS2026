package Exercitiul3.Classes;

public class Client extends AClient{
    public Client(String numeClient, int idClient, String emailClient, String numarTelefon) {
        super(numeClient, idClient, emailClient, numarTelefon);
    }

    public Client() {
    }

    @Override
    public AClient copy() {
        AClient clona = new Client();
        ((Client)clona).numeClient = this.numeClient;
        ((Client)clona).idClient = this.idClient;
        ((Client)clona).emailClient = this.emailClient;
        ((Client)clona).numarTelefon = this.numarTelefon;
        return clona;

    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", idClient=").append(idClient);
        sb.append(", emailClient='").append(emailClient).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
