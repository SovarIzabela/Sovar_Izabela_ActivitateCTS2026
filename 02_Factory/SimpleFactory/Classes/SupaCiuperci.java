package Classes;

public class SupaCiuperci extends Supa{
    public SupaCiuperci(String ingrediente, float pret, int calorii) {
        super(ingrediente, pret, calorii);
    }

    @Override
    public void descriere() {
        System.out.println("Aceasta este o supa de Ciuperci");

    }
}
