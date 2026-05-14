package exercitiul9.classes;

public class Producator extends AService{


    @Override
    public void repartizeazaProbleme(Problema problema) {
        if(problema.getGravitate().equals("critica")){
            System.out.println("Problema a fost reprtizata cater Producator");
        }
    }
}
