package Classes;

public class SupaLegume extends Supa {
    public SupaLegume(String ingrediente, float pret, int calorii) {
        super(ingrediente, pret, calorii);
    }

    @Override
    public void descriere() {
        System.out.println("Aceasta este o supa de Legume");
    }
}
