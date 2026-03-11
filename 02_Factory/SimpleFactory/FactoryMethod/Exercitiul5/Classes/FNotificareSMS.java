package FactoryMethod.Exercitiul5.Classes;

public class FNotificareSMS implements AFactory{
    @Override
    public INotificare creareNotificare(String mesajNotificare, String numeDestinatar) {
        return new NotificareSMS( mesajNotificare, numeDestinatar);
    }
}
