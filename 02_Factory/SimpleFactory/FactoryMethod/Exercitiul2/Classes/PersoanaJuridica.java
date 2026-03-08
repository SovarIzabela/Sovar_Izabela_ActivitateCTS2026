package FactoryMethod.Exercitiul2.Classes;

public class PersoanaJuridica extends AClient{



    public PersoanaJuridica(String numeClient) {
        super(numeClient);
    }

    @Override
    public void descriereClient() {
        System.out.println("Acest client este o persoana Juridica");
    }
}
