package exercitiul6.classes;

public class Facade {


    public void deschideUsileLiber(){

        UsaFata usaFata = new UsaFata();
        usaFata.deschideModLiber();
        UsaMijloc usaMijloc = new UsaMijloc();
        usaMijloc.deschideModLiber();
        UsaSpate usaSpate = new UsaSpate();
        usaSpate.deschideModLiber();


    }

    public void deschideFortat(){

        UsaFata usaFata = new UsaFata();
        usaFata.deschideFortat();
        UsaMijloc usaMijloc = new UsaMijloc();
        usaMijloc.deschideFortat();
        UsaSpate usaSpate = new UsaSpate();
        usaSpate.deschideFortat();
    }


}
