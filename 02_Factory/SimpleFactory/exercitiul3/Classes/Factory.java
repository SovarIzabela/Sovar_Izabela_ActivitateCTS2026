package exercitiul3.Classes;

public class Factory {

    public ICredit intoarceCredit(TipCredite tipCredite,int suma, int perioadaLuni, String client, double rataLunara, double dobanda ) throws Exception {

        switch(tipCredite){

            case IPOTECAR : return new CreditIpotecar(suma, perioadaLuni, client, rataLunara, dobanda);
            case NEVOIPERSONALE:return new CreditNevoiPersonale(suma, perioadaLuni, client, rataLunara, dobanda);
            default:throw new Exception("Nu este un credit valid");



        }



    }



}
