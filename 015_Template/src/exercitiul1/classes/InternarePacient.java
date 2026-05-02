package exercitiul1.classes;

public abstract class InternarePacient {

    private int codPacient;
    private String numePacient;
    private String afectiune;


    public InternarePacient(int codPacient, String numePacient, String afectiune) {
        this.codPacient = codPacient;
        this.numePacient = numePacient;
        this.afectiune = afectiune;
    }

    public int getCodPacient() {
        return codPacient;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public String getAfectiune() {
        return afectiune;
    }

    public abstract void emitereFisaInternarePacient();
    public abstract void analizeazaStareaPacient();
    public abstract void verificareSalon();

    public final void interneazaPacient(){
        analizeazaStareaPacient();
        verificareSalon();
        emitereFisaInternarePacient();
    }


}
