package exercitiul6.classes;

public class Cititor implements Iobserver{

   private int idCititor;
    private String numeCititor;

    public Cititor(int idCititor, String numeCititor) {
        this.idCititor = idCititor;
        this.numeCititor = numeCititor;
    }

    public int getIdCititor() {
        return idCititor;
    }

    public String getNumeCititor() {
        return numeCititor;
    }

    @Override
    public void receptineazaMesaj(String mesaj) {
        System.out.println("Cititorul " + this.numeCititor + " a receptionat mesajul : " + mesaj);
    }

    @Override
    public String toString() {
        return "Cititor{" +
                "idCititor=" + idCititor +
                ", numeCititor='" + numeCititor + '\'' +
                '}';
    }
}
