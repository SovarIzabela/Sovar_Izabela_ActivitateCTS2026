package exercitiul2.classes;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {


    private List<MementoMeci> lista = new ArrayList<>();

    public void adaugaMemento(MementoMeci mementoMeci){
        lista.add(mementoMeci);
    }
    public MementoMeci getMemento(int index){
       return lista.get(index);
    }

    public MementoMeci getLastMemento(){
        if(lista.size()!=0){
            MementoMeci mementoMeci = lista.get(lista.size()-1);
            lista.remove(lista.size()-1);
            return mementoMeci;
        }else {
            throw new RuntimeException("Lista este goala!");
        }

    }

    @Override
    public String toString() {
        return "ManagerMemento{" +
                "lista=" + lista +
                '}';
    }
}
