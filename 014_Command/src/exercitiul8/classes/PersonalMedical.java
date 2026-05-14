package exercitiul8.classes;

public class PersonalMedical implements IPersonalMedical{

    private String numePacient;
    private String sectie;

    public PersonalMedical(String numePacient, String sectie) {
        this.numePacient = numePacient;
        this.sectie = sectie;
    }

    @Override
    public void programareConsultatie() {
        System.out.println("S-a programat consultatia pentru pacientul " + numePacient + " sectia" + sectie);
    }

    @Override
    public void anulareConsultatie() {
        System.out.println("S-a anulat consultatia pentru pacientul " + numePacient + " sectia" + sectie);
    }

    @Override
    public void emiteReteta() {
        System.out.println("S-a emis reteta pentru pacientul " + numePacient + " sectia" + sectie);
    }
}
