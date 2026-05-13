package exercitiul4.classes;



public class ComandaOcupare implements Icommand {

   private IMasaRestaurant masa;

    public ComandaOcupare(IMasaRestaurant masa) {
        this.masa = masa;
    }

    @Override
    public void executa() {
        masa.ocupareMasa();
    }
}
