package SingletonRegistry.Exercitiul3.Classes;



import java.util.HashMap;
import java.util.Map;

public class ManagerRezervare {

    private String locatieMeci;
    private int nrLocuri;
    private String prgramFunctionare;
    private String denumireSport;
    private static Map<String, ManagerRezervare> instanta = new HashMap<>();

    private ManagerRezervare(String locatieMeci, int nrLocuri, String prgramFunctionare, String denumireSport) {
        this.locatieMeci = locatieMeci;
        this.nrLocuri = nrLocuri;
        this.prgramFunctionare = prgramFunctionare;
        this.denumireSport = denumireSport;
    }

    public static synchronized ManagerRezervare getInstance(String locatieMeci, int nrLocuri, String prgramFunctionare, String denumireSport){

        if(!instanta.containsKey(locatieMeci)){
            instanta.put(locatieMeci, new ManagerRezervare(locatieMeci, nrLocuri, prgramFunctionare, denumireSport));
        }

        return instanta.get(locatieMeci);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ManagerRezervare{");
        sb.append("locatieMeci='").append(locatieMeci).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", prgramFunctionare='").append(prgramFunctionare).append('\'');
        sb.append(", denumireSport='").append(denumireSport).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
