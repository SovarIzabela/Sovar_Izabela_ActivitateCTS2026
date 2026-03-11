package Singleton4.Classes;

public class ConfigurareAplicatie {


    private String temaAplicatie;
    private int timeOut;
    private boolean areNotificariActivate;

    private static ConfigurareAplicatie instanta=null;

    private ConfigurareAplicatie(String temaAplicatie, int timeOut, boolean areNotificariActivate) {
        this.temaAplicatie = temaAplicatie;
        this.timeOut = timeOut;
        this.areNotificariActivate = areNotificariActivate;
    }


    public static synchronized ConfigurareAplicatie getInstance(String temaAplicatie, int timeOut, boolean areNotificariActivate){

        if(instanta==null){
            instanta = new ConfigurareAplicatie( temaAplicatie,timeOut, areNotificariActivate);

        }
        return instanta;

    }

    public void afisareConfigurare(){
        final StringBuilder sb = new StringBuilder("ConfigurareAplicatie{");
        sb.append("temaAplicatie='").append(temaAplicatie).append('\'');
        sb.append(", timeOut=").append(timeOut);
        sb.append(", areNotificariActivate=").append(areNotificariActivate);
        sb.append('}');
        System.out.println(sb.toString());

    }


}
