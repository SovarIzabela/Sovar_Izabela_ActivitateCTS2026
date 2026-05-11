package exercitiul6.classes;

public class CardCalatorii implements Ivalidator{
    @Override
    public void platesteCalatorie(float pretBilet) {
        System.out.println("S-a efectuat plata biletului prin CardCalatorii suma de : " + pretBilet);
    }
}
