package Singleton2.Classes;

public class ManagerBilet {

    private String stadion;
    private float taxaRezervare;
    private String programFunctionare;
    private int nrMaximLocuri;
    private static ManagerBilet instanta=null;

    private ManagerBilet(String stadion, float taxaRezervare, String programFunctionare, int nrMaximLocuri) {
        this.stadion = stadion;
        this.taxaRezervare = taxaRezervare;
        this.programFunctionare = programFunctionare;
        this.nrMaximLocuri = nrMaximLocuri;
    }

    public String getStadion() {
        return stadion;
    }

    public void setStadion(String stadion) {
        this.stadion = stadion;
    }

    public float getTaxaRezervare() {
        return taxaRezervare;
    }

    public void setTaxaRezervare(float taxaRezervare) {
        this.taxaRezervare = taxaRezervare;
    }

    public int getNrMaximLocuri() {
        return nrMaximLocuri;
    }

    public void setNrMaximLocuri(int nrMaximLocuri) {
        this.nrMaximLocuri = nrMaximLocuri;
    }

    public String getProgramFunctionare() {
        return programFunctionare;
    }

    public void setProgramFunctionare(String programFunctionare) {
        this.programFunctionare = programFunctionare;
    }



    public static synchronized ManagerBilet getInstance(){
        if(instanta== null){
            instanta= new ManagerBilet("Ghencea", 50.0f,"Luni-Duminica", 500);
        }
        return instanta;
    }




    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ManagerBilet{");
        sb.append("stadion='").append(stadion).append('\'');
        sb.append(", taxaRezervare=").append(taxaRezervare);
        sb.append(", programFunctionare='").append(programFunctionare).append('\'');
        sb.append(", nrMaximLocuri=").append(nrMaximLocuri);
        sb.append('}');
        return sb.toString();
    }
}
