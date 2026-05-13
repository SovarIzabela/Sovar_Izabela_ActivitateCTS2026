package exercitiul6.classes;

public class Cabinet extends Aspital{
    @Override
    public void repartizarePacient(Pacient pacient) {
        if(pacient.getGravitate()>=1&&pacient.getGravitate()<=3){
            System.out.println("Pacientul trebuie dus la Cabinet Medical");
        }else{

            super.getUrmator().repartizarePacient(pacient);
        }
    }
}
