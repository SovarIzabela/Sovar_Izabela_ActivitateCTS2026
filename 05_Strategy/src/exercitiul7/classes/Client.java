package exercitiul7.classes;

public class Client {


    private String numeClient;
    private ILivrare tipLivrare;

    public Client(String numeClient, ILivrare tipLivrare) {
        this.numeClient = numeClient;
        this.tipLivrare = tipLivrare;
    }

    public Client(String numeClient) {
        this.numeClient = numeClient;
        this.tipLivrare = new LivrareStandard();
    }

    public void setTipLivrare(ILivrare tipLivrare) {
        this.tipLivrare = tipLivrare;
    }


    public void livrareComanda(String numarComanda){

        tipLivrare.livrareComanda(numarComanda);
    }



}
