package Exercitiul6.Classes;

public class Cash implements Plata{

    private float sumaPlatita;
    private float soldFinal;

    public Cash(float sumaPlatita, float soldFinal) {
        this.sumaPlatita = sumaPlatita;
        this.soldFinal = soldFinal;
    }

    @Override
    public float proceseazaPlata(float sumaPlatita) {
        return soldFinal = soldFinal-sumaPlatita;
    }

    public float getSumaPlatita() {
        return sumaPlatita;
    }

    public float getSoldFinal() {
        return soldFinal;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cash{");
        sb.append("sumaPlatita=").append(sumaPlatita);
        sb.append(", soldFinal=").append(soldFinal);
        sb.append('}');
        return sb.toString();
    }
}
