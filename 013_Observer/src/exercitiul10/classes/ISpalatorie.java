package exercitiul10.classes;

public interface ISpalatorie {


    void adaugaClient(IObserverClient client);
    void stergeClient(IObserverClient client);

    void notificaClient(String mesaj);



}
