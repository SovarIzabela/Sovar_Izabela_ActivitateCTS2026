package exercitiul4.Classes;

import java.util.ArrayList;
import java.util.List;

public class Builder implements IBuilder{


    private AutobuzLinie autobuzLinie;

    public Builder(String model, String numeSofer){
        this.autobuzLinie = new AutobuzLinie(model, numeSofer, false, false,  new ArrayList<>());
    }

    public Builder setModel(String model) {
        this.autobuzLinie.setModel(model);
        return this;
    }

    public Builder setNumeSofer(String numeSofer) {
        this.autobuzLinie.setNumeSofer(numeSofer);
        return this;
    }

    public Builder setAreOprireCapatLinie(boolean areOprireCapatLinie) {
        this.autobuzLinie.setAreOprireCapatLinie(areOprireCapatLinie);
        return this;
    }

    public Builder setDeschideUsileAutomat(boolean deschideUsileAutomat) {
        this.autobuzLinie.setDeschideUsileAutomat(deschideUsileAutomat);
        return this;
    }

    public Builder setTestAfisareEcranDerulant(List<String> testAfisareEcranDerulant) {
        this.autobuzLinie.setTestAfisareEcranDerulant(new ArrayList<>(testAfisareEcranDerulant));
        return this;
    }

    @Override
    public AutobuzLinie build() {
        return autobuzLinie;
    }
}
