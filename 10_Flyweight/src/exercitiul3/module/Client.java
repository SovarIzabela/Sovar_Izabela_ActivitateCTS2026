package exercitiul3.module;

import exercitiul2.classes.IClient;


public class Client implements Iclient {

    private String numeClient;
    private String adresaClient;
    private String numarTelefon;
    private String adresaEmail;

    public Client(String numeClient, String adresaClient, String numarTelefon, String adresaEmail) {
        this.numeClient = numeClient;
        this.adresaClient = adresaClient;
        this.numarTelefon = numarTelefon;
        this.adresaEmail = adresaEmail;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", adresaClient='").append(adresaClient).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append(", adresaEmail='").append(adresaEmail).append('\'');
        sb.append('}');
        return sb.toString();
    }


    @Override
    public void detalii(Card card) {
        System.out.println(this.toString() + card.toString());
    }
}
