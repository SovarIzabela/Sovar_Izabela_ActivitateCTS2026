package FactoryMethod.Exercitiul6.Classes;

public class FContEconomii implements IFactory{
    @Override
    public ContBancar creareCont(String titular, float sold) {
        return new ContEconomii(titular, sold);
    }
}
