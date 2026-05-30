package exercitiul4.classes;

public class OcupareLoc {

    private int nrLoc;
    private IStare stare;

    public OcupareLoc(int nrLoc) {
        this.nrLoc = nrLoc;
        this.stare = new Liber();
    }


    public int getNrLoc() {
        return nrLoc;
    }

    public void setNrLoc(int nrLoc) {
        this.nrLoc = nrLoc;
    }

    public IStare getStare() {
        return stare;
    }

    public void setStare(IStare stare) {
        this.stare = stare;
    }
}
