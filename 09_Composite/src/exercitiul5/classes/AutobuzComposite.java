package exercitiul5.classes;

import java.util.ArrayList;
import java.util.List;

public class AutobuzComposite implements IFlotaAutobuz{

    private String nume;
    private List<IFlotaAutobuz> lista = new ArrayList<>();

    public AutobuzComposite(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaNod(IFlotaAutobuz flotaAutobuz) {
        lista.add(flotaAutobuz);
    }

    @Override
    public void stergeNod(IFlotaAutobuz flotaAutobuz) {
        lista.remove(flotaAutobuz);
    }

    @Override
    public IFlotaAutobuz getNod(int index) {
       return lista.get(index);
    }

    @Override
    public void descriere(String indent) {
        System.out.println(nume);

        for(IFlotaAutobuz element: lista){

            element.descriere(indent);
        }

    }
}
