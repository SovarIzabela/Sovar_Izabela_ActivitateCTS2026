package Exercitiul1.classes;

import java.util.ArrayList;
import java.util.List;

public class ManagerMementoCont {

    private List<MementoCont> lista = new ArrayList<>();

    public void adauga(MementoCont cont){
        lista.add(cont);
    }

    public MementoCont getMemento(int index){
        return lista.get(index);
    }

    public void sterge(MementoCont cont){
        lista.remove(cont);
    }

    public MementoCont getLastMemento() throws Exception {
        if(!lista.isEmpty()){
        MementoCont mementoCont = lista.get(lista.size()-1);
        lista.remove(lista.size()-1);
        return mementoCont;
        }else{
            throw new Exception("lista nu contine elemente");
        }
    }


    @Override
    public String toString() {
        return "ManagerMementoCont{" +
                "lista=" + lista +
                '}';
    }
}
