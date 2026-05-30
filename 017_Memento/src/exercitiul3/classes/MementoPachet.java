package exercitiul3.classes;

public class MementoPachet {

    private float pret;

    public MementoPachet(float pret) {
        this.pret = pret;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }


    @Override
    public String toString() {
        return "MementoPachet{" +
                "pret=" + pret +
                '}';
    }
}
