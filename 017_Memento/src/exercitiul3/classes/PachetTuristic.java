package exercitiul3.classes;

public class PachetTuristic {


    private int id;
    private String destinatie;
    private float pret;

    public PachetTuristic(int id, String destinatie, float pret) {
        this.id = id;
        this.destinatie = destinatie;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "PachetTuristic{" +
                "id=" + id +
                ", destinatie='" + destinatie + '\'' +
                ", pret=" + pret +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }



    public MementoPachet salveazaMemento(){

        return new MementoPachet(this.pret);
    }


    public void undo(MementoPachet mementoPachet ){
        this.pret= mementoPachet.getPret();

    }



}
