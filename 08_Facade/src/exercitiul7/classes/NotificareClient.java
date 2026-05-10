package exercitiul7.classes;

public class NotificareClient {

    private String numeClient;

    public NotificareClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void verificareNotificareClient(){

        System.out.println("S-a notificat clientul" + this.numeClient);
    }

    @Override
    public String toString() {
        return "NotificareClient{" +
                "numeClient='" + numeClient + '\'' +
                '}';
    }
}
