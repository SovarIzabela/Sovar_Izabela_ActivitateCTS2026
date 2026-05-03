package exercitiul4.classes;

public class Pacient {


    private String numePacient;
    private boolean areCardSanatate;
    private int varsta;
    private String afectiune;
    private boolean necesitaInvestigatii;

    public Pacient(String numePacient, boolean areCardSanatate, int varsta, String afectiune, boolean necesitaInvestigatii) {
        this.numePacient = numePacient;
        this.areCardSanatate = areCardSanatate;
        this.varsta = varsta;
        this.afectiune = afectiune;
        this.necesitaInvestigatii = necesitaInvestigatii;
    }


    @Override
    public String toString() {
        return "Pacient{" +
                "numePacient='" + numePacient + '\'' +
                ", areCardSanatate=" + areCardSanatate +
                ", varsta=" + varsta +
                ", afectiune='" + afectiune + '\'' +
                ", necesitaInvestigatii=" + necesitaInvestigatii +
                '}';
    }

    public boolean verificaGravitatea(){
        if(necesitaInvestigatii==true){
            System.out.println("Pacientul trebuie internat pentru investigatii !");
            return true;
        }

        System.out.println("Pacientul nu trebui internat");
        return false;

    }






}
