package exercitiul6.classes;

public class CardBancar implements Ivalidator{
    @Override
    public void platesteCalatorie(float pretBilet) {
        System.out.println("S-a efectuat plata biletului prin CardBancar suma de : " + pretBilet);
    }
}
