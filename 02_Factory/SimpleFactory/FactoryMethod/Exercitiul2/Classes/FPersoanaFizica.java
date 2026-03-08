package FactoryMethod.Exercitiul2.Classes;

public class FPersoanaFizica extends AFactory{

    @Override
    public AClient intoarceClient(String numeClient) {
        return new PersoanaFizica(numeClient);
    }




}
