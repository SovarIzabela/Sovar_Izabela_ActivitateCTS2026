package exercitiul2.main;

import exercitiul2.classes.*;

public class Main {

    public static void main(String[] args){

        Anotificator anotificatorTelefon = new NotificatorTelefon();
        Anotificator notificatorEmail = new NotificatorEmail();
        Anotificator notificatorManager = new NotificatorManager();


        anotificatorTelefon.setAnotificator(notificatorEmail);
        notificatorEmail.setAnotificator(notificatorManager);

        ClientFidel c1 = new ClientFidel("Client 1 ", " 07452789", null);
        ClientFidel c3 = new ClientFidel("Client 3 ", null, "email@goole.com");
        ClientFidel c2 = new ClientFidel("Client 2", null, null);


        anotificatorTelefon.notificaClient(c1, "->avem o oferta noua ");
        notificatorEmail.notificaClient(c2, "->avem o oferta noua ");

        anotificatorTelefon.notificaClient(c3,"->avem o oferta noua!");


    }



}
