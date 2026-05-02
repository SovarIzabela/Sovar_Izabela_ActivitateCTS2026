package exercitiul1.classes;

public class InternareUrgenta extends InternarePacient {
    public InternareUrgenta(int codPacient, String numePacient, String afectiune) {
        super(codPacient, numePacient, afectiune);
    }

    @Override
    public void emitereFisaInternarePacient() {
        System.out.println("s-a efectuat emiterea fisei de Internare URGENTA a pacientului");
    }

    @Override
    public void analizeazaStareaPacient() {
        System.out.println("Se analizeaza de urgenta starea pacientului");
    }

    @Override
    public void verificareSalon() {
        System.out.println("S-a efectuat verificare de urgenta a salonului");
    }
}
