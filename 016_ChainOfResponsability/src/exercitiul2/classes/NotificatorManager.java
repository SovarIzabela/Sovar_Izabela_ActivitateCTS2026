package exercitiul2.classes;

public class NotificatorManager extends Anotificator{
    @Override
    public void notificaClient(ClientFidel clientFidel, String mesaj) {

        System.out.println("Clientul " + clientFidel.getNumeClient() + " nu are Nr telefon si email  introduse in sistem !");

    }
}
