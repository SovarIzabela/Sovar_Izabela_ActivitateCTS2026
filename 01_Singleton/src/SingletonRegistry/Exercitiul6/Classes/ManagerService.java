package SingletonRegistry.Exercitiul6.Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagerService extends AMasina{

    private static  Map<String, ManagerService> instance = new HashMap<>();

    private ManagerService(String oras, int nrMecanici, List<String> listaMasini) {
        this.oras = oras;
        this.nrMecanici = nrMecanici;
        this.listaMasini = new ArrayList<>(listaMasini);
    }

    @Override
    public void addMasina(String masina) {
        listaMasini.add(masina);
    }


    public static synchronized ManagerService getInstance(String oras, int nrMecanici, List<String> listaMasini){
        if(!instance.containsKey(oras)){
            instance.put(oras, new ManagerService(oras, nrMecanici, new ArrayList<>(listaMasini)));
        }
        return instance.get(oras);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ManagerService{");
        sb.append("oras='").append(oras).append('\'');
        sb.append(", nrMecanici=").append(nrMecanici);
        sb.append(", listaMasini=").append(listaMasini);
        sb.append('}');
        return sb.toString();
    }
}
