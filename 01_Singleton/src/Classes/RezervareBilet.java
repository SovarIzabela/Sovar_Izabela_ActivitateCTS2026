package Classes;

public class RezervareBilet {

    private String denumireFilm;
    private int nrLoc;
    private float pret;
    public static RezervareBilet instanta=null;

    private RezervareBilet(String denumireFilm, int nrLoc, float pret) {
        this.denumireFilm = denumireFilm;
        this.nrLoc = nrLoc;
        this.pret = pret;
    }

    public static synchronized RezervareBilet getInstance(){
        if(instanta==null){
            instanta = new RezervareBilet("Avatar", 15, 55);
        }

        return instanta;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BileteCinema{");
        sb.append("denumireFilm='").append(denumireFilm).append('\'');
        sb.append(", nrLoc=").append(nrLoc);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
