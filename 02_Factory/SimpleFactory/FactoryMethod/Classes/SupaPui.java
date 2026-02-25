package FactoryMethod.Classes;

public class SupaPui extends Supa{

    public SupaPui(String ingrediente, float pret, int calorii) {
        super(ingrediente, pret, calorii);
    }

    @Override
    public void descriere() {
        System.out.println("Aceasta este o supa de pui");
    }
}
