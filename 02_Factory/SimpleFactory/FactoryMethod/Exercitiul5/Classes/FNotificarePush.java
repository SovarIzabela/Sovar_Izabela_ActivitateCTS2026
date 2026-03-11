package FactoryMethod.Exercitiul5.Classes;

public class FNotificarePush implements AFactory{
    @Override
    public INotificare creareNotificare(String mesajNotificare, String numeDestinatar) {
        return new NotificarePush(mesajNotificare, numeDestinatar);
    }
}
