package exercitiul2.Classes;

public class StocDepozit  implements IStocDepozit{


    private int idMedicament;
    private String numeMedicament;
    private int stoc;
    private boolean  necesitaReteta;

    public StocDepozit(int idMedicament, String numeMedicament, int stoc, boolean necesitaReteta) {
        this.idMedicament = idMedicament;
        this.numeMedicament = numeMedicament;
        this.stoc = stoc;
        this.necesitaReteta = necesitaReteta;
    }

    @Override
    public boolean verificaStocPentruMedicament(int id, int nrCantitate) {
       if(this.idMedicament==id&& this.stoc>=nrCantitate){
           return true;
       }else{
           return false;
       }


    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StocDepozit{");
        sb.append("idMedicament=").append(idMedicament);
        sb.append(", numeMedicament='").append(numeMedicament).append('\'');
        sb.append(", stoc=").append(stoc);
        sb.append(", necesitaReteta=").append(necesitaReteta);
        sb.append('}');
        return sb.toString();
    }
}
