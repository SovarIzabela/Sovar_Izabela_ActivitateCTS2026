package exercitiul3.classes;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {


    private List<MementoPachet> listaMememnto = new ArrayList<>();


    public void adauga(MementoPachet mementoPachet){
        listaMememnto.add(mementoPachet);
    }


    public void sterge(MementoPachet mementoPachet){
        listaMememnto.remove(mementoPachet);
    }

    public MementoPachet getMemento(int index){
        return listaMememnto.get(index);
    }

    public MementoPachet getLastMemento() throws Exception {
        if(listaMememnto.size()!=0){
            MementoPachet mem= listaMememnto.get(listaMememnto.size()-1);
            listaMememnto.remove(listaMememnto.size()-1);
            return  mem;
        }else{
            throw new Exception("Lista nu contine obiecte!");
        }

    }


    @Override
    public String toString() {
        return "ManagerMemento{" +
                "listaMememnto=" + listaMememnto +
                '}';
    }
}
