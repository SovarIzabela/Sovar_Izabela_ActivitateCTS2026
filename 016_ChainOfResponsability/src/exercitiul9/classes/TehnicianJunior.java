package exercitiul9.classes;

public class TehnicianJunior extends AService{




    @Override
    public void repartizeazaProbleme(Problema problema) {
        if(problema.getGravitate().equals("minora")){
            System.out.println("Problema a fost reprtizata catre Tehnician Junior!");
        }else{

            super.getUrmator().repartizeazaProbleme(problema);

        }


    }
}
