package exercitiul9.classes;

public class VerificareBilet {


    private int idBilet;

    public VerificareBilet(int idBilet) {
        this.idBilet = idBilet;
    }

    public boolean verificareBilet(int idBilet){
        if(idBilet==this.idBilet){
            System.out.println("Bilet ok !");
            return true;
        }else{
            System.out.println("Biletul nu este valid!");
            return false;

        }

    }


}
