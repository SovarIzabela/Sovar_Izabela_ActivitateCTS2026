package exercitiul7.classes;

public class ProxyAplicatie implements Iaplicatie{

    private Aplicatie aplicatie;

    public ProxyAplicatie(Aplicatie aplicatie) {
        this.aplicatie = aplicatie;
    }

    @Override
    public void descarcaFisier() {
        if(aplicatie.isUserAutentificat()){
            aplicatie.descarcaFisier();
        }else{
            System.out.println("Este necesara autentificarea in aplicatie pentru a descarca fisier!");
        }
    }
}
