package exercitiul4.classes;

public interface Ibanca {

    void adaugaClient(IObserver observer);
    void stergeClient(IObserver observer);
    void notificaClient(String mesaj);

}
