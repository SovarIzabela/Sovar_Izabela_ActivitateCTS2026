package exercitiul5.classes;

public class Facade {

    public void verificareClient(String numeBilet, int idBilet, String numeClient, boolean areCazier, String serieBuletin){

        VerificareBilet verificareBilet = new VerificareBilet(numeBilet, idBilet);
      boolean verificareB =  verificareBilet.corespundeBilet(numeClient);

        VerificarePolitie verificarePolitie = new VerificarePolitie(numeClient, areCazier);
       boolean verificareP =  verificarePolitie.verificarePolitie();

        VerificareAntecedenteStadion verificareAntecedenteStadion = new VerificareAntecedenteStadion(serieBuletin);

        boolean verificareA = verificareAntecedenteStadion.areAntecedente();

        if(!verificareA&&verificareB&&!verificareP){
            System.out.println("Se indeplinesc toate conditiile! persoana poate intra pe stadion");
        }else{

            System.out.println("Persoana nu poate intra pe stadion!");
        }



    }




}
