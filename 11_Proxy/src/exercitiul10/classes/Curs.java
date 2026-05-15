package exercitiul10.classes;

public class Curs implements AbstractCurs{

    private String numeCurs;


    public Curs(String numeCurs) {
        this.numeCurs = numeCurs;
    }


    public String getNumeCurs() {
        return numeCurs;
    }

    @Override
    public void afiseazaContinut(String tipUtilizator) {
        System.out.println("Utilizatorul  a accesat cursul: " + numeCurs);
    }
}
