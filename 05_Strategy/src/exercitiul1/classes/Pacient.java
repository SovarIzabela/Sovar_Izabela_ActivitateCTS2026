package exercitiul1.classes;

public class Pacient {

    private String numePacient;
    private int idPacient;
    private int varsta;
    private boolean areCardSanatate;
    private ImodPlata imodPlata;


    public Pacient(String numePacient, int idPacient, int varsta, boolean areCardSanatate, ImodPlata imodPlata) {
        this.numePacient = numePacient;
        this.idPacient = idPacient;
        this.varsta = varsta;
        this.areCardSanatate = areCardSanatate;
        this.imodPlata = imodPlata;
    }

    public Pacient(String numePacient, int idPacient, int varsta, boolean areCardSanatate) {
        this.numePacient = numePacient;
        this.idPacient = idPacient;
        this.varsta = varsta;
        this.areCardSanatate = areCardSanatate;
        this.imodPlata = new Card();
        }



    public void setImodPlata(ImodPlata imodPlata) {
        this.imodPlata = imodPlata;
    }


  public void plateste(float suma){
        imodPlata.plateste(this.numePacient, suma);
  }




    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", idPacient=").append(idPacient);
        sb.append(", varsta=").append(varsta);
        sb.append(", areCardSanatate=").append(areCardSanatate);
        sb.append(", imodPlata=").append(imodPlata);
        sb.append('}');
        return sb.toString();
    }
}
