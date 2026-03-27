package exercitiul2.Classes;

public class VerificareDisponibilitateDepozit {

    private String numeMedicament;
    private int stocDepozit;

    public boolean areStoc(){
        return true;
    }

    public VerificareDisponibilitateDepozit(String numeMedicament, int stocDepozit) {
        this.numeMedicament = numeMedicament;
        this.stocDepozit = stocDepozit;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VerificareDisponibilitateDepozit{");
        sb.append("numeMedicament='").append(numeMedicament).append('\'');
        sb.append(", stocDepozit=").append(stocDepozit);
        sb.append('}');
        return sb.toString();
    }
}
