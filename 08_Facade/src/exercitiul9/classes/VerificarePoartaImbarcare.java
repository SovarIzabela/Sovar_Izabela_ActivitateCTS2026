package exercitiul9.classes;

public class VerificarePoartaImbarcare {

    private int numarPoarta;

    public VerificarePoartaImbarcare(int numarPoarta) {
        this.numarPoarta = numarPoarta;
    }


    public boolean verificarePoarta(int poarta){
        if(poarta==this.numarPoarta){
            return true;
        }else{
            System.out.println("Poarta nu este corecta!");
            return false;

        }

    }




}
