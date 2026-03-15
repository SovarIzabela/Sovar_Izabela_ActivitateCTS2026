package Singleton5.Classes;

import java.util.ArrayList;
import java.util.List;

public class Masina extends AMasina{

    public static Masina instanta=null;


    private Masina(String marca, String sasiu, List<String> listaMesaje) {
        this.marca = marca;
        this.sasiu = sasiu;
        this.listaMesaje = new ArrayList<>(listaMesaje);
    }

    public static synchronized Masina getInstance(String marca, String sasiu, List<String> listaMesaje){
        if(instanta==null){
            instanta=new Masina(marca, sasiu,listaMesaje);
        }
        return instanta;
    }



    @Override
    public void addMesaj(String mesaj) {
        listaMesaje.add(mesaj);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", sasiu='").append(sasiu).append('\'');
        sb.append(", listaMesaje=").append(listaMesaje);
        sb.append('}');
        return sb.toString();
    }
}
