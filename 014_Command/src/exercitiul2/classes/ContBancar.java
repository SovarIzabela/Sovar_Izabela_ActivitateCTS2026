package exercitiul2.classes;

public class ContBancar {

    private String numeTitular;
    private String bancaEmitenta;
    private float sumaCont;

    public ContBancar(String numeTitular, String bancaEmitenta, float sumaCont) {
        this.numeTitular = numeTitular;
        this.bancaEmitenta = bancaEmitenta;
        this.sumaCont = sumaCont;
    }

    public void setSumaCont(float sumaCont) {
        this.sumaCont = sumaCont;
    }

    public void constituire(float suma){
        sumaCont = suma;
    }

    public void depunere(double suma){
        sumaCont+=suma;
    }

    public void retragere(double suma){
        sumaCont-=suma;
    }

}
