package exercitiul8.classes;

import java.util.ArrayList;
import java.util.List;

public class DepartamentComposite implements IFirma{

    private String numeDepartmen;

    private List<IFirma> listaNod = new ArrayList<>();


    public DepartamentComposite(String numeDepartmen) {
        this.numeDepartmen = numeDepartmen;
    }

    @Override
    public void adaugaNod(IFirma firma) {
        listaNod.add(firma);
    }

    @Override
    public void stergeNod(IFirma firma) {
        listaNod.remove(firma);
    }

    @Override
    public IFirma getNod(int index) {

        return listaNod.get(index);
    }

    @Override
    public void descriere(String indent) {
        System.out.println(indent + "Departament:" + numeDepartmen);

        for(IFirma dep:listaNod){
            dep.descriere(indent + " ");
        }


    }
}
