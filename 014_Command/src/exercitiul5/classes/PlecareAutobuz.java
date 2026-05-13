package exercitiul5.classes;



public class PlecareAutobuz implements Icommand {

    private Iautobuz autobuz;
    private int numarLinie;

    public PlecareAutobuz(Iautobuz autobuz, int numarLinie) {
        this.autobuz = autobuz;
        this.numarLinie = numarLinie;
    }

    @Override
    public void executa() {
        autobuz.plecareAutobuz(numarLinie);
    }
}
