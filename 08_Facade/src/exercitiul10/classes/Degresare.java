package exercitiul10.classes;

public class Degresare {

    private String numeSolutie;
    private int cantitate;

    public Degresare(String numeSolutie, int cantitate) {
        this.numeSolutie = numeSolutie;
        this.cantitate = cantitate;
    }




    public void degreseaza(){
        System.out.println("Masina a fost degresata folosind solutia !" + numeSolutie);
    }




}
