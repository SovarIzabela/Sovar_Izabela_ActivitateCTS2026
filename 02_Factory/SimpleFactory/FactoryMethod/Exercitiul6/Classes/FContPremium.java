package FactoryMethod.Exercitiul6.Classes;

public class FContPremium implements IFactory{
    @Override
    public ContBancar creareCont(String titular, float sold) {
        return new ContPremium(titular, sold);
    }
}
