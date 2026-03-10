package SingletonRegistry.Exercitiul4.Classes;

import java.util.HashMap;
import java.util.Map;

public class ValidatorStatie {

    private String numeStatie;
    private String tipTransport; //autobuz, troleibuz, tramvai
    private boolean areCasaBilete;

    private static Map<String, ValidatorStatie> instance = new HashMap<>();

    private ValidatorStatie(String numeStatie, String tipTransport, boolean areCasaBilete) {
        this.numeStatie = numeStatie;
        this.tipTransport = tipTransport;
        this.areCasaBilete = areCasaBilete;
    }


    public static synchronized ValidatorStatie getInstance(String numeStatie, String tipTransport, boolean areCasaBilete){
        if(!instance.containsKey(numeStatie)){
            instance.put(numeStatie, new ValidatorStatie( numeStatie, tipTransport, areCasaBilete));
        }
        return instance.get(numeStatie);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ValidatorStatie{");
        sb.append("numeStatie='").append(numeStatie).append('\'');
        sb.append(", tipTransport='").append(tipTransport).append('\'');
        sb.append(", areCasaBilete=").append(areCasaBilete);
        sb.append('}');
        return sb.toString();
    }
}
