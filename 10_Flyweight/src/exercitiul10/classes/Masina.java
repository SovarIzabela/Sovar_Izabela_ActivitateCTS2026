package exercitiul10.classes;

public class Masina implements IJocVideo {

      private String model;
      private String culoare;
      private int tipMotor;

    public Masina(String model, String culoare, int tipMotor) {
        this.model = model;
        this.culoare = culoare;
        this.tipMotor = tipMotor;
    }

    @Override
    public void descriere(Optionale optionale) {
        System.out.println(this.toString()+ optionale.toString());
    }


    @Override
    public String toString() {
        return "Masina{" +
                "model='" + model + '\'' +
                ", culoare='" + culoare + '\'' +
                ", tipMotor=" + tipMotor +
                '}';
    }
}
