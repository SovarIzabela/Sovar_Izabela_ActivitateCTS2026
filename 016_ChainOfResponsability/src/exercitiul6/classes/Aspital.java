package exercitiul6.classes;

public abstract class Aspital {


    protected Aspital urmator;

    public Aspital getUrmator() {
        return urmator;
    }

    public void setUrmator(Aspital urmator) {
        this.urmator = urmator;
    }

    public abstract void repartizarePacient(Pacient pacient);


}
