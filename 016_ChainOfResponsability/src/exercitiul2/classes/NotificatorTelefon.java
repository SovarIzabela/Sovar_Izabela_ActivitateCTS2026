package exercitiul2.classes;

public class NotificatorTelefon extends Anotificator{
    @Override
    public void notificaClient(ClientFidel clientFidel, String mesaj) {
        if(clientFidel.getNumarTelefon()!=null){
            System.out.println("Clientul " + clientFidel.getNumeClient() + "a fost notificat prin SMS"+ mesaj);
        }else{

            super.getAnotificator().notificaClient(clientFidel,mesaj);
        }
    }
}
