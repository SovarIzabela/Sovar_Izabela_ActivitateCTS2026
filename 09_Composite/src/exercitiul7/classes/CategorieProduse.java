package exercitiul7.classes;

import java.util.ArrayList;
import java.util.List;

public class CategorieProduse implements IProduse{

    private String numeCategorie;

    private List<IProduse> lista = new ArrayList<>();

    public CategorieProduse(String numeCategorie) {
        this.numeCategorie = numeCategorie;
    }

    @Override
    public void adaugaNod(IProduse produse) {
            lista.add(produse);
    }

    @Override
    public void stergeNod(IProduse produse) {
        lista.remove(produse);
    }

    @Override
    public IProduse getProdus(int index) {
        return lista.get(index);
    }

    @Override
    public void descriere(String indent) {
        System.out.println(indent + numeCategorie);

        for(IProduse produse:lista){
            produse.descriere(indent+" ");

        }


    }
}
