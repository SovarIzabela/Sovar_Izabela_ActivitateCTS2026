package Singleton3.Classes;

public class ManagerAbonamentLunarStb {

    private float tarifBilet;
    private String oras;
    private int durataAbonament;

    private static ManagerAbonamentLunarStb instanta =null;

    private ManagerAbonamentLunarStb(float tarifBilet, String oras, int durataAbonament) {
        this.tarifBilet = tarifBilet;
        this.oras = oras;
        this.durataAbonament = durataAbonament;
    }


    public static synchronized ManagerAbonamentLunarStb getInstance(float tarifBilet, String oras, int durataAbonament){

        if(instanta==null){

            instanta= new ManagerAbonamentLunarStb(tarifBilet, oras, durataAbonament);
        }

        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ManagerAbonamentLunarStb{");
        sb.append("tarifBilet=").append(tarifBilet);
        sb.append(", oras='").append(oras).append('\'');
        sb.append(", durataAbonament=").append(durataAbonament);
        sb.append('}');
        return sb.toString();
    }
}
