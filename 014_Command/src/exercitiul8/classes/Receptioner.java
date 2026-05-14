package exercitiul8.classes;



import java.util.ArrayList;
import java.util.List;

public class Receptioner {

    List <ICommand> listaComanda = new ArrayList<>();

    public Receptioner(List<ICommand> listaComanda) {
        this.listaComanda = listaComanda;
    }

    public void lanseazaComanda(){

        for(ICommand comanda: listaComanda){

            comanda.executa();

        }
    }




}
