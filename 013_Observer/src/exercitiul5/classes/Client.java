package exercitiul5.classes;

public class Client implements Iobserver{


    private String numeClient;
    private int varsta;

    public Client(String numeClient, int varsta) {
        this.numeClient = numeClient;
        this.varsta = varsta;
    }

    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println("Clientul " + numeClient+ " a receptionat mesajul" + mesaj);
    }

    @Override
    public String toString() {
        return "Client{" +
                "numeClient='" + numeClient + '\'' +
                ", varsta='" + varsta + '\'' +
                '}';
    }
}
