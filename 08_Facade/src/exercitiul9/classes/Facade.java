package exercitiul9.classes;

public class Facade {



    public void realizeazaImbarcare(String numePasager, String tara,int idBilet, int greutate, int numarPoarta ){

        VerificareBilet bilet= new VerificareBilet(idBilet);
        boolean vb=   bilet.verificareBilet(idBilet);
        VerificarePasaport pasaport = new VerificarePasaport(numePasager, tara);
        boolean vp=  pasaport.verificarePassaport(numePasager);
        VerificareBagaj bagaj = new VerificareBagaj(greutate);
        boolean bg =   bagaj.verificareBagaj();
        VerificarePoartaImbarcare porti = new VerificarePoartaImbarcare(numarPoarta);
        boolean p =   porti.verificarePoarta(numarPoarta);

        if(vb&&vp&&bg&&p){
            System.out.println("Imbarcarea se poate face! ");

        }else{
            System.out.println("Nu se poate realiza imbarcarea pasagerului!");
        }





    }



}
