package exercitiul3.module;

import java.util.ArrayList;
import java.util.List;

public class AgentieComposite implements ISucursala{

    private String numeAgentie;
    List<ISucursala> listaFiliale = new ArrayList<>();

    public AgentieComposite(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }

    @Override
    public void adaugaNod(ISucursala nod) throws Exception {
        listaFiliale.add(nod);
    }
    @Override
    public void getNod(int index) throws Exception {
        listaFiliale.get(index);
    }

    @Override
    public void stergeNod(ISucursala nod) throws Exception {
        listaFiliale.remove(nod);
    }

    @Override
    public void descriere(String indent) {
        System.out.println("Agentia->"+numeAgentie);

        for(ISucursala element:listaFiliale){
            element.descriere(indent+" ");
        }

    }
}
