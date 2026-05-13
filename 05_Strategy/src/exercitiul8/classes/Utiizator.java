package exercitiul8.classes;

public class Utiizator {

    private String numeUtilizator;

    private IPretTransport pret;

    public Utiizator(String numeUtilizator, IPretTransport pret) {
        this.numeUtilizator = numeUtilizator;
        this.pret = pret;
    }

    public Utiizator(String numeUtilizator) {
        this.numeUtilizator = numeUtilizator;
        this.pret = new PretStandard();
    }

    public String getNumeUtilizator() {
        return numeUtilizator;
    }

    public void setNumeUtilizator(String numeUtilizator) {
        this.numeUtilizator = numeUtilizator;
    }

    public IPretTransport getPret() {
        return pret;
    }

    public void setPret(IPretTransport pret) {
        this.pret = pret;
    }

    public void calculPretTransport(){
        pret.calculPretTransport();

    }



}
