package SingletonRegistry.Exercitiul2.Classes;

import java.util.HashMap;
import java.util.Map;

public class BancaManager {

    private String orasSucursala;
    private int numarGhisee;
    private float fondCreditRon;

    private static Map<String, BancaManager> mapSucursalaManager = new HashMap<>();

    private BancaManager(String orasSucursala, int numarGhisee, float fondCreditRon) {
        this.orasSucursala = orasSucursala;
        this.numarGhisee = numarGhisee;
        this.fondCreditRon = fondCreditRon;
    }

    public static synchronized BancaManager getInstance(String orasSucursala, int numarGhisee, float fondCreditRon){
        if(!mapSucursalaManager.containsKey(orasSucursala)){
            mapSucursalaManager.put(orasSucursala, new BancaManager(orasSucursala, numarGhisee,fondCreditRon));
        }
        return mapSucursalaManager.get(orasSucursala);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BancaManager{");
        sb.append("orasSucursala='").append(orasSucursala).append('\'');
        sb.append(", numarGhisee=").append(numarGhisee);
        sb.append(", fondCreditRon=").append(fondCreditRon);
        sb.append('}');
        return sb.toString();
    }
}
