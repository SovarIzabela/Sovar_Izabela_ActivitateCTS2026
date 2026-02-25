package FactoryMethod.Classes;

public class FsupaVita implements IFabrica{
    @Override
    public Supa intoarceSupa(String ingrediente, float pret, int calorii) {
        return new SupaVita(ingrediente,  pret,calorii);
    }
}
