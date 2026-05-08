package exercitiul6.classes;

import java.util.ArrayList;
import java.util.List;

public class VirusCategorie implements IVirus{
    private String numeCategorie;
    private List<IVirus> listaVirus = new ArrayList<>();

    public VirusCategorie(String numeCategorie) {
        this.numeCategorie = numeCategorie;
    }

    @Override
    public void adaugaNod(IVirus virus) {
        listaVirus.add(virus);
    }

    @Override
    public void stergeNod(IVirus virus) {
        listaVirus.remove(virus);
    }

    @Override
    public void descriere(String indent) {
        System.out.println(indent + numeCategorie);

        for(IVirus virus:listaVirus){

            virus.descriere(indent+ "--");
        }
    }

    @Override
    public IVirus getVirus(int index) {
        return listaVirus.get(index);
    }
}
