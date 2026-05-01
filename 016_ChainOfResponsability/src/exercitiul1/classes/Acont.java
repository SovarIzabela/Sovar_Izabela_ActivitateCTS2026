package exercitiul1.classes;

public abstract class Acont {


    private Acont cont;




    public Acont getCont() {
        return cont;
    }

    public void setCont(Acont cont) {
        this.cont = cont;
    }

    public abstract void plateste(Cont cont, float suma);



}
