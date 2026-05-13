package exercitiul6.classes;

public class CameraGarda extends Aspital{
    @Override
    public void repartizarePacient(Pacient pacient) {
        if(pacient.getGravitate()>=4&&pacient.getGravitate()<=6){
            System.out.println("Pacientul trebuie dus la Camera de Garda!");
        }else{

            super.getUrmator().repartizarePacient(pacient);
        }
    }
}
