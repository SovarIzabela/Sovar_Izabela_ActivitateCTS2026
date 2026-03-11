package FactoryMethod.Exercitiul6.Classes;

public class FContCurent implements IFactory{
    @Override
    public ContBancar creareCont(String titular, float sold) {
        return new ContCurent(titular, sold);
    }
}
