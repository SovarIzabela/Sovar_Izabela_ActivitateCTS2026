package FactoryMethod.Classes;

public class FsupaCiuperci implements IFabrica{


    @Override
    public Supa intoarceSupa(String ingrediente, float pret, int calorii) {
        return new SupaCiuperci(ingrediente, pret, calorii);
    }
}
