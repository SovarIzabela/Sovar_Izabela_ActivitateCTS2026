package exercitiul10.classes;

public class Client implements IObserverClient{

    private String numeClient;

    public Client(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println("Clientul " +numeClient+  "a receptionat mesajul :  " + mesaj);
    }
}
