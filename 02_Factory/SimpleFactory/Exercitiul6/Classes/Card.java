package Exercitiul6.Classes;

public class Card implements Plata{

    private float sumaPlatita;
    private float soldFinal;

    public Card(float sumaPlatita, float soldFinal) {
        this.sumaPlatita = sumaPlatita;
        this.soldFinal = soldFinal;
    }

    public float getSumaPlatita() {
        return sumaPlatita;
    }

    public float getSoldFinal() {
        return soldFinal;
    }

    @Override
    public float proceseazaPlata(float sumaPlatita) {
        return soldFinal = soldFinal-sumaPlatita;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Card{");
        sb.append("sumaPlatita=").append(sumaPlatita);
        sb.append(", soldFinal=").append(soldFinal);
        sb.append('}');
        return sb.toString();
    }
}
