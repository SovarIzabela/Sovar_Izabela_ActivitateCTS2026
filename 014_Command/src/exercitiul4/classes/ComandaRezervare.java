package exercitiul4.classes;



public class ComandaRezervare implements Icommand {

    private IMasaRestaurant masa;

    public ComandaRezervare(IMasaRestaurant masa) {
        this.masa = masa;
    }

    @Override
    public void executa() {
        masa.rezervareMasa();
    }
}
