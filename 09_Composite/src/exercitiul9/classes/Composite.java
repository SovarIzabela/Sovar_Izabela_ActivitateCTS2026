package exercitiul9.classes;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IUniversitate{

    private String denumire;
    private List<IUniversitate> lista = new ArrayList<>();

    public Composite(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugaNod(IUniversitate universitate) {
        lista.add(universitate);
    }

    @Override
    public void stergeNod(IUniversitate universitate) {
        lista.remove(universitate);
    }

    @Override
    public IUniversitate getNod(int index) {
      return   lista.get(index);
    }

    @Override
    public void descriere(String indent) {
        System.out.println(indent + denumire);
        for(IUniversitate universitate:lista){
            universitate.descriere(indent);
        }

    }
}
