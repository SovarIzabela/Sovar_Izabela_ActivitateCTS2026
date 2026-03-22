package exercitiul1.module;

import java.util.ArrayList;
import java.util.List;

public class SectiuneComposite implements Isectiune{

    private String numeSectiune;
    List<Isectiune> listaSectiuni = new ArrayList<>();

    public SectiuneComposite(String numeSectiune) {
        this.numeSectiune = numeSectiune;
    }

    @Override
    public void adaugaNod(Isectiune nod) {
        listaSectiuni.add(nod);
    }

    @Override
    public void getNod(int index) {
        listaSectiuni.get(index);
    }

    @Override
    public void stergeNod(Isectiune nod) {
        listaSectiuni.remove(nod);
    }

    @Override
    public void descriere(String indent) throws Exception {
        System.out.println(indent+"sectiunea este -> " + numeSectiune);
        for(Isectiune elem:listaSectiuni){
            elem.descriere(indent+" ");
        }

    }
}
