package exercitiul2.module;

import java.util.ArrayList;
import java.util.List;

public class SectiuneComposite implements ISectiune {

    private String numeSectiune;
    List<ISectiune> lista = new ArrayList<>();

    public SectiuneComposite(String numeSectiune) {
        this.numeSectiune = numeSectiune;
    }

    @Override
    public void adaugaNod(ISectiune sectiune) {
        lista.add(sectiune);
    }

    @Override
    public void getNod(int index) {
        lista.get(index);
    }

    @Override
    public void stergenod(ISectiune sectiune) {
        lista.remove(sectiune);
    }

    @Override
    public void descriere(String indent) {
        System.out.println(indent+ "Sectiune->" + this.numeSectiune);
        for(ISectiune elem: lista){
            elem.descriere(indent);
        }
    }


}
