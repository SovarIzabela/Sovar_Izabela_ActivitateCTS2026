package exercitiul1.classes;

public class InternareNormala extends InternarePacient{
    public InternareNormala(int codPacient, String numePacient, String afectiune) {
        super(codPacient, numePacient, afectiune);
    }

    @Override
    public void emitereFisaInternarePacient() {
        System.out.println("s-a efectuat emiterea fisei de Internare a pacientului");
    }

    @Override
    public void analizeazaStareaPacient() {
        System.out.println("Se analizeaza starea pacientului");
    }

    @Override
    public void verificareSalon() {
        System.out.println("S-a efectuat verificare salonului");
    }
}
