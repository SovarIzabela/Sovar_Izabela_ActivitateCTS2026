package exercitiul4.classes;

public class ProxyAutobuz implements Iautobuz{

    private Autobuz autobuz;
    private int nrCalatori;

    public ProxyAutobuz(Autobuz autobuz, int nrCalatori) {
        this.autobuz = autobuz;
        this.nrCalatori = nrCalatori;
    }

    @Override
    public void oprireStatie(String numeStatie) {

        if(nrCalatori>0){
           autobuz.oprireStatie(numeStatie);
        }else{
            System.out.println("Autobuzul se retrage la autobaza !");
        }

    }
}
