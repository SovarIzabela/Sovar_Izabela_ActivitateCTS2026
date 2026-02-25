package FactoryMethod.Classes;

public class SupaVita extends Supa {




    public SupaVita(String ingrediente, float pret, int calorii) {
        super(ingrediente, pret, calorii);
    }

    @Override
    public void descriere() {
        System.out.println("Aceasta este o supa de Vita");
    }
}
