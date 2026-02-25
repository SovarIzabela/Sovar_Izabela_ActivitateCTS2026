package FactoryMethod.Classes;

public class FsupaPui implements IFabrica{
    @Override
    public Supa intoarceSupa(String ingrediente, float pret, int calorii) {
        return new SupaPui(ingrediente,pret,calorii);
    }
}
