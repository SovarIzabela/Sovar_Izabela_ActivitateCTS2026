package exercitiul2.Classes;

public class Farmacia implements IMedicament{

    private int idMedicament;
    private String numeMedicament;
    private int stoc;
    private boolean  necesitaReteta;

    public Farmacia(int idMedicament, String numeMedicament, int stoc, boolean necesitaReteta) {
        this.idMedicament = idMedicament;
        this.numeMedicament = numeMedicament;
        this.stoc = stoc;
        this.necesitaReteta = necesitaReteta;
    }

    @Override
    public void setareMedicament(int id) {
        this.idMedicament = id;
    }

    @Override
    public boolean verificaDisponibilitate(int nrMedicamenteDorite) {
        if(stoc>=nrMedicamenteDorite){
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Farmacia{");
        sb.append("nrMedicament=").append(idMedicament);
        sb.append(", numeMedicament='").append(numeMedicament).append('\'');
        sb.append(", stoc=").append(stoc);
        sb.append(", necesitaReteta=").append(necesitaReteta);
        sb.append('}');
        return sb.toString();
    }
}
