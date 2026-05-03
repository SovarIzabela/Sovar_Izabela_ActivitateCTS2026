package exercitiul4.classes;

public class Medic {

    private String numeMedic;
    private String specializare;

    public Medic(String numeMedic, String specializare) {
        this.numeMedic = numeMedic;
        this.specializare = specializare;
    }

    @Override
    public String toString() {
        return "Medic{" +
                "numeMedic='" + numeMedic + '\'' +
                ", specializare='" + specializare + '\'' +
                '}';
    }



    public boolean verificaInternare(Pacient pacient){

        if(pacient.verificaGravitatea()){
            System.out.println("Se interneaza pacientul");
        }
        return false;
    }




}
