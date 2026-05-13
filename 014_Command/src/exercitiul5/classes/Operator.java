package exercitiul5.classes;

import java.util.ArrayList;
import java.util.List;

public class Operator {


    private List<Icommand> listaComanda = new ArrayList<>();

    public Operator(List<Icommand> listaComanda) {
        this.listaComanda = listaComanda;
    }

    public void adaugaComanda(Icommand icommand){
        listaComanda.add(icommand);
    }


    public void lanseazaComanda(){

        for(Icommand comanda: listaComanda){
            comanda.executa();
        }


    }



}
