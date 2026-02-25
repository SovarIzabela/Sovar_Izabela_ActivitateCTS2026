package Classes;

public abstract class Supa {

    protected String ingrediente;
    protected float pret;
    protected int calorii;


    public Supa(String ingrediente, float pret, int calorii) {
        this.ingrediente = ingrediente;
        this.pret = pret;
        this.calorii = calorii;
    }


    public abstract void descriere();



}
