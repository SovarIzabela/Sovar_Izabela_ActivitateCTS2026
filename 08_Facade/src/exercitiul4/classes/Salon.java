package exercitiul4.classes;

import java.util.List;

public class Salon {

    private String numeSpital;
    private String sectie;
    private List<Integer> paturiOcupate;
    private List<Integer> paturiLibeere;

    public Salon(String numeSpital, String sectie, List<Integer> paturiOcupate, List<Integer> paturiLibeere) {
        this.numeSpital = numeSpital;
        this.sectie = sectie;
        this.paturiOcupate = paturiOcupate;
        this.paturiLibeere = paturiLibeere;
    }


    @Override
    public String toString() {
        return "Salon{" +
                "numeSpital='" + numeSpital + '\'' +
                ", sectie='" + sectie + '\'' +
                ", paturiOcupate=" + paturiOcupate +
                ", paturiLibeere=" + paturiLibeere +
                '}';
    }


    public void verificaPatLiber(int numarPat){
        for(int pat:paturiLibeere){
            if(numarPat==pat){
                System.out.println("Patul este disponibil!");
                paturiOcupate.add(pat);
            }

        }


    }





}
