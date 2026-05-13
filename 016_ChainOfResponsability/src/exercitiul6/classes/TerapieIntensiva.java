package exercitiul6.classes;

public class TerapieIntensiva extends Aspital{
    @Override
    public void repartizarePacient(Pacient pacient) {
        if(pacient.getGravitate()>=7&&pacient.getGravitate()<=9){
            System.out.println("Pacientul trebuie dus la Terapie Intensiva!");
        }else{

            super.getUrmator().repartizarePacient(pacient);
        }
    }
}
