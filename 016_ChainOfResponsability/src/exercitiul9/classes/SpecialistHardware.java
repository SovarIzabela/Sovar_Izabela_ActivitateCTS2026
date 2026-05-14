package exercitiul9.classes;

public class SpecialistHardware extends AService{


    @Override
    public void repartizeazaProbleme(Problema problema) {
        if(problema.getGravitate().equals("grava")){
            System.out.println("Problema a fost reprtizata catre Specialist Hardware!");
        }else{

            super.getUrmator().repartizeazaProbleme(problema);

        }
    }
}
