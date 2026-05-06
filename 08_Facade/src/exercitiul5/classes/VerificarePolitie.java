package exercitiul5.classes;

public class VerificarePolitie {

    private String numeClient;

    private boolean areCazier;

    public VerificarePolitie(String numeClient, boolean areCazier) {
        this.numeClient = numeClient;
        this.areCazier = areCazier;
    }


    public boolean verificarePolitie(){

        if(areCazier==true){

            System.out.println("Are cazier!");
            return true;
        }else{
            System.out.println("Nu are cazier!");
            return false;
        }
    }





    @Override
    public String toString() {
        return "VerificarePolitie{" +
                "numeClient='" + numeClient + '\'' +
                ", areCazier=" + areCazier +
                '}';
    }










}
