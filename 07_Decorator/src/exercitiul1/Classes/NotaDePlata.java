package exercitiul1.Classes;

public class NotaDePlata implements Inota{

    private String numeClient;
    private float suma;


    public String getNumeClient() {
        return numeClient;
    }

    public float getSuma() {
        return suma;
    }

    public NotaDePlata(String numeClient, float suma) {
        this.numeClient = numeClient;
        this.suma = suma;
    }

    @Override
    public void printeazaNota() {
        System.out.println("Aveti de plata ->" + suma);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NotaDePlata{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", suma=").append(suma);
        sb.append('}');
        return sb.toString();
    }
}
