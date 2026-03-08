package FactoryMethod.Exercitiul2.Classes;

public class FPersoanaJuridica extends AFactory{
    @Override
    public AClient intoarceClient(String numeClient) {
        return new PersoanaJuridica(numeClient);
    }
}
