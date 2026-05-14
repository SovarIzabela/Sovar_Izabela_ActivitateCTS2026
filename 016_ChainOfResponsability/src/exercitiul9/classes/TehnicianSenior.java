package exercitiul9.classes;

public class TehnicianSenior extends AService{



    @Override
    public void repartizeazaProbleme(Problema problema) {

        if(problema.getGravitate().equals("medie")){
            System.out.println("Problema a fost reprtizata catre Tehnician Senior!!");
        }else{

            super.getUrmator().repartizeazaProbleme(problema);

        }

    }
}
