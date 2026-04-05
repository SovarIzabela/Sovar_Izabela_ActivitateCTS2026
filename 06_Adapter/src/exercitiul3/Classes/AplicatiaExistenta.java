package exercitiul3.Classes;

public class AplicatiaExistenta {

    private IAplicatiaExistenta credit;

    public AplicatiaExistenta(IAplicatiaExistenta credit) {
        this.credit = (IAplicatiaExistenta) credit;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AplicatiaExistenta{");
        sb.append("credit=").append(credit);
        sb.append('}');
        return sb.toString();
    }

    public void proceseazaCredit() {
        credit.acordaCredit();
    }
}
