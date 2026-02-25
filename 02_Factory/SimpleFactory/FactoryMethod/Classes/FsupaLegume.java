package FactoryMethod.Classes;

public class FsupaLegume implements IFabrica{
    @Override
    public Supa intoarceSupa(String ingrediente, float pret, int calorii) {
        return new SupaLegume(ingrediente, pret,  calorii);
    }
}
