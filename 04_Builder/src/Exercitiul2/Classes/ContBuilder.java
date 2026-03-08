package Exercitiul2.Classes;

public class ContBuilder implements IBilder {


    private Cont cont;

    public ContBuilder() {

        this.cont = new Cont("Necunoscut", " Necunoscut" , false, false, false);
    }

    public ContBuilder setNumeClient(String numeClient) {
        this.cont.setNumeClient(numeClient);
        return this;
    }

    public ContBuilder setIban(String iban) {
        this.cont.setIban(iban);
        return this;
    }

    public ContBuilder setPrimesteSalariul(boolean primesteSalariul) {
        this.cont.setPrimesteSalariul(primesteSalariul);
        return this;
    }

    public ContBuilder setAreCard(boolean areCard) {
        this.cont.setAreCard(areCard);
        return this;
    }

    public ContBuilder setAreInternetBanking(boolean areInternetBanking) {
        this.cont.setAreInternetBanking(areInternetBanking);
        return this;
    }


    @Override
    public Cont build() {
        return cont;
    }
}
