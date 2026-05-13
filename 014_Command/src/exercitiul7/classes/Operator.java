package exercitiul7.classes;

import java.util.ArrayList;
import java.util.List;

public class Operator {


    List<Icommand> listaComenzi = new ArrayList<>();

    public Operator(List<Icommand> listaComenzi) {
        this.listaComenzi = listaComenzi;
    }


  public  void lanseazaComanda(){
        for(Icommand comanda:listaComenzi){
            comanda.executa();
        }
    }


}
