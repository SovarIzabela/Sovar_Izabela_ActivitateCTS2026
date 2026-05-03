package exercitiul4.classes;

import java.util.ArrayList;
import java.util.List;

public class SectiuneNod implements Isectiune{

    private String numeSectiune;
    List<Isectiune> listaSectiuni = new ArrayList<>();

    public SectiuneNod(String numeSectiune) {
        this.numeSectiune = numeSectiune;
    }


    @Override
    public void adaugaNod(Isectiune nod) throws Exception {
        listaSectiuni.add(nod);
    }

    @Override
    public void getNod(int index) throws Exception {
        listaSectiuni.get(index);
    }

    @Override
    public void stergeNod(Isectiune nod) throws Exception {
        listaSectiuni.remove(nod);
    }

    @Override
    public void descriere(String indent) {
        System.out.println("Sectiunea -> " + numeSectiune);

        for(Isectiune sectiune: listaSectiuni){
            sectiune.descriere(indent);
        }

    }

    @Override
    public String toString() {
        return "SectiuneNod{" +
                "numeSectiune='" + numeSectiune + '\'' +
                ", listaSectiuni=" + listaSectiuni +
                '}';
    }
}
