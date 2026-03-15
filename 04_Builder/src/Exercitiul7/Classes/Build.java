package Exercitiul7.Classes;

public class Build implements Ibuilder{

    private Pizza pizza;

    public Build(String aluat, int dimensiune) {

        pizza=new Pizza(aluat, dimensiune, false, false, false);
    }

    public Build setTipAluat(String tipAluat) {
        this.pizza.setTipAluat(tipAluat);
        return this;
    }

    public Build setDimensiune(int dimensiune) {
        this.pizza.setDimensiune(dimensiune);
        return this;
    }

    public Build setExtraBranza(boolean extraBranza) {
        this.pizza.setExtraBranza(extraBranza);
        return this;
    }

    public Build setAreMasline(boolean areMasline) {
        this.pizza.setAreMasline(areMasline);
        return this;
    }

    public Build setAreSosPicant(boolean areSosPicant) {
        this.pizza.setAreSosPicant(areSosPicant);
        return this;
    }





    @Override
    public Pizza build() {
        return pizza;
    }
}
