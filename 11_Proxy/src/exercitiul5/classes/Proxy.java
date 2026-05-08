package exercitiul5.classes;

public class Proxy implements Iinternare {

    private Internare internare;

    public Proxy(Internare internare) {
        this.internare = internare;
    }

    @Override
    public void interneazaPacient(Pacient pacient) {
        if(pacient.isAreAsigurare()){
            internare.interneazaPacient(pacient);
        }else{
            System.out.println("Pacientul nu are asigurare si nu se poate interna!");
        }
    }
}
