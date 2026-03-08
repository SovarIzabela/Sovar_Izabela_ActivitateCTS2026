package FactoryMethod.Exercitiul2.Classes;

public class PersoanaFizica extends AClient{




    public PersoanaFizica(String numeClient) {
        super(numeClient);
    }

    @Override
    public void descriereClient() {
        System.out.println("Acest client este o persoana Fizica");
    }
}
