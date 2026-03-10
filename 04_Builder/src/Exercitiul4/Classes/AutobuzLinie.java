package Exercitiul4.Classes;

import java.util.ArrayList;
import java.util.List;

public class AutobuzLinie {

    private String model;
    private String numeSofer;
    private boolean areOprireCapatLinie;
    private boolean deschideUsileAutomat;
    private List<String> testAfisareEcranDerulant;


    public AutobuzLinie(String model, String numeSofer, boolean areOprireCapatLinie, boolean deschideUsileAutomat, List<String> testAfisareEcranDerulant) {
        this.model = model;
        this.numeSofer = numeSofer;
        this.areOprireCapatLinie = areOprireCapatLinie;
        this.deschideUsileAutomat = deschideUsileAutomat;
        this.testAfisareEcranDerulant = new ArrayList<>(testAfisareEcranDerulant);
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setAreOprireCapatLinie(boolean areOprireCapatLinie) {
        this.areOprireCapatLinie = areOprireCapatLinie;
    }

    public void setDeschideUsileAutomat(boolean deschideUsileAutomat) {
        this.deschideUsileAutomat = deschideUsileAutomat;
    }

    public void setTestAfisareEcranDerulant(List<String> testAfisareEcranDerulant) {
        this.testAfisareEcranDerulant = new ArrayList<>(testAfisareEcranDerulant);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("model='").append(model).append('\'');
        sb.append(", numeSofer='").append(numeSofer).append('\'');
        sb.append(", areOprireCapatLinie=").append(areOprireCapatLinie);
        sb.append(", deschideUsileAutomat=").append(deschideUsileAutomat);
        sb.append(", testAfisareEcranDerulant=").append(testAfisareEcranDerulant);
        sb.append('}');
        return sb.toString();
    }
}
