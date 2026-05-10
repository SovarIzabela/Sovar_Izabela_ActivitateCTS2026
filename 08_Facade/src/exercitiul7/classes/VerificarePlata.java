package exercitiul7.classes;

public class VerificarePlata {

    private String tipPlata;
    private float suma;

    public VerificarePlata(String tipPlata, float suma) {
        this.tipPlata = tipPlata;
        this.suma = suma;
    }

    public void verificarePlata(){
        System.out.println("S-a efectuat verificarea platii!");
    }

    @Override
    public String toString() {
        return "VerificarePlata{" +
                "tipPlata='" + tipPlata + '\'' +
                ", suma=" + suma +
                '}';
    }
}
