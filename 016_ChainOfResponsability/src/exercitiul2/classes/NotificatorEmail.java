package exercitiul2.classes;

public class NotificatorEmail extends Anotificator{
    @Override
    public void notificaClient(ClientFidel clientFidel, String mesaj) {
        if(clientFidel.getEmail()!=null){
            System.out.println("Clientul " + clientFidel.getNumeClient() + "a fost notificat pe email cu mesajul " + mesaj);
        }else{
            super.getAnotificator().notificaClient(clientFidel, mesaj);
        }
    }
}
