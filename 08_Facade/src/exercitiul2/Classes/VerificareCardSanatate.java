package exercitiul2.Classes;

public class VerificareCardSanatate {

    private String numePacient;
    private int idCard;

    public boolean areCardSanatate(){
        return true;
    }

    public VerificareCardSanatate(String numePacient, int idCard) {
        this.numePacient = numePacient;
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VerificareCardSanatate{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", idCard=").append(idCard);
        sb.append('}');
        return sb.toString();
    }
}
