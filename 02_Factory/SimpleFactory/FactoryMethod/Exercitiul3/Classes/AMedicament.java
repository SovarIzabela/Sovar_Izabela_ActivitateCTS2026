package FactoryMethod.Exercitiul3.Classes;

public abstract class AMedicament {

    protected String denumire;
    protected float pret;

    public AMedicament(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public AMedicament() {

    }

    public abstract void descriere();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AMedicamente{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
