package SingletonRegistry.Exercitiul5.Classes;

import java.util.HashMap;
import java.util.Map;

public class ManagerSucursala {


    private String oras;
    private int numarAngajati;
    private float buget;
    private static Map<String, ManagerSucursala> instance = new HashMap<>();

    private ManagerSucursala(String oras, int numarAngajati, float buget) {
        this.oras = oras;
        this.numarAngajati = numarAngajati;
        this.buget = buget;
    }


    public static synchronized ManagerSucursala getInstance( String oras, int numarAngajati, float buget){

        if(!instance.containsKey(oras)){
            instance.put(oras, new ManagerSucursala( oras, numarAngajati, buget));
        }

       return instance.get(oras);


    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ManagerSucursala{");
        sb.append("oras='").append(oras).append('\'');
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append(", buget=").append(buget);
        sb.append('}');
        return sb.toString();
    }
}
