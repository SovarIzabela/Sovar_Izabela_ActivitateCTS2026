package SingletonRegistry.Exercitiul1.Classes;

import java.util.HashMap;
import java.util.Map;

public class Piata {

    private String cartier;
    private String numePiata;
    private int numarTarabe;

    private static Map<String, Piata> mapPiata = new HashMap<>();//eager

    private Piata(String cartier, String numePiata, int numarTarabe) {
        this.cartier = cartier;
        this.numePiata = numePiata;
        this.numarTarabe = numarTarabe;
    }



    public static synchronized Piata getInstance(String cartier, String numePiata, int numarTarabe){
        if(!mapPiata.containsKey(cartier)){
            mapPiata.put(cartier, new Piata(cartier, numePiata, numarTarabe));

        }

        return mapPiata.get(cartier);

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Piata{");
        sb.append("cartier='").append(cartier).append('\'');
        sb.append(", numePiata='").append(numePiata).append('\'');
        sb.append(", numarTarabe=").append(numarTarabe);
        sb.append('}');
        return sb.toString();
    }
}


