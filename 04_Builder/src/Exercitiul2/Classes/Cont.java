package Exercitiul2.Classes;

public class Cont {


    private String numeClient;
    private String iban;
    private boolean primesteSalariul;
    private boolean areCard;
    private boolean areInternetBanking;

    public Cont(String numeClient, String iban, boolean primesteSalariul, boolean areCard, boolean areInternetBanking) {
        this.numeClient = numeClient;
        this.iban = iban;
        this.primesteSalariul = primesteSalariul;
        this.areCard = areCard;
        this.areInternetBanking = areInternetBanking;
    }


    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setPrimesteSalariul(boolean primesteSalariul) {
        this.primesteSalariul = primesteSalariul;
    }

    public void setAreCard(boolean areCard) {
        this.areCard = areCard;
    }

    public void setAreInternetBanking(boolean areInternetBanking) {
        this.areInternetBanking = areInternetBanking;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", iban='").append(iban).append('\'');
        sb.append(", primesteSalariul=").append(primesteSalariul);
        sb.append(", areCard=").append(areCard);
        sb.append(", areInternetBanking=").append(areInternetBanking);
        sb.append('}');
        return sb.toString();
    }
}
