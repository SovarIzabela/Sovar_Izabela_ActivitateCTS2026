package exercitiul5.classes;

import java.util.Objects;

public class VerificareBilet {

    private String numeBilet;
    private int idBilet;

    public VerificareBilet(String numeBilet, int idBilet) {
        this.numeBilet = numeBilet;
        this.idBilet = idBilet;
    }


    @Override
    public String toString() {
        return "VerificareBilet{" +
                "numeBilet='" + numeBilet + '\'' +
                ", idBilet=" + idBilet +
                '}';
    }


    public boolean corespundeBilet(String numeClient){
        if(this.numeBilet.equals(numeClient)){
            System.out.println("Corespunde numele de pe bilet");
            return true;
        }else{
            System.out.println("Nu Corespunde numele de pe bilet");
            return false;
        }


    }



}
