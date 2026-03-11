package FactoryMethod.Exercitiul5.Main;

import FactoryMethod.Exercitiul5.Classes.*;

public class Main {

    public static void main(String[] args){

        FNotificareEmail fNotificareEmail = new FNotificareEmail();
        FNotificarePush fNotificarePush = new FNotificarePush();
        FNotificareSMS fNotificareSMS = new FNotificareSMS();

        INotificare notificarePush = fNotificarePush.creareNotificare("Notificare Push","Popescu");
        INotificare notificareEmail = fNotificareEmail.creareNotificare("Notificare Email 1","Ionescu");
        INotificare notificareSMS = fNotificareSMS.creareNotificare("Notificare SMS","Vasilescu");

        notificarePush.descriereNotificare();
        notificareEmail.descriereNotificare();
        notificareSMS.descriereNotificare();



    }
}
