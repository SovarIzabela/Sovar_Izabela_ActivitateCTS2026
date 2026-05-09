package exercitiul7.classes;

public class Copac implements Icopac{


    private String tipCopac;
    private boolean areFrunza;

    public Copac(String tipCopac, boolean areFrunza) {
        this.tipCopac = tipCopac;
        this.areFrunza = areFrunza;
    }



    @Override
    public void deseneazaCopac(OptionaleCopac optionaleCopac) {
        System.out.println(this.toString() + optionaleCopac.toString());
    }

    @Override
    public String toString() {
        return "Copac{" +
                "tipCopac='" + tipCopac + '\'' +
                ", areFrunza=" + areFrunza +
                '}';
    }
}
