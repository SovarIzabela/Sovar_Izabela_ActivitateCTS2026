package FactoryMethod.Exercitiul5.Classes;

public class FNotificareEmail implements AFactory{
    @Override
    public INotificare creareNotificare(String mesajNotificare, String numeDestinatar) {
        return new NotificareEmail(mesajNotificare, numeDestinatar);
    }
}
