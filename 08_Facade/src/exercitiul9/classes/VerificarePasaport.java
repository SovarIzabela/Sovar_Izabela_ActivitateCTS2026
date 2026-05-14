package exercitiul9.classes;

public class VerificarePasaport {

    private String numePasager;
    private String tara;

    public VerificarePasaport(String numePasager, String tara) {
        this.numePasager = numePasager;
        this.tara = tara;
    }


    public boolean verificarePassaport(String numePasager){
        if(numePasager.equals(numePasager)){
            System.out.println("Pasaportul a trecut verificarea!");
            return true;
        }else{
            System.out.println("Pasaportul nu a trecut verifcarea!");
            return false;
        }
    }

}
