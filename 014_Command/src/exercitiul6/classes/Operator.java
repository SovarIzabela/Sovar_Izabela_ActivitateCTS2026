package exercitiul6.classes;

import java.util.List;

public class Operator {


    private List<ICommand> lista;

    public Operator(List<ICommand> lista) {
        this.lista = lista;
    }

  public  void lanseazaComanda(){

        for(ICommand comanda: lista){
            comanda.executa();
        }


    }



}
