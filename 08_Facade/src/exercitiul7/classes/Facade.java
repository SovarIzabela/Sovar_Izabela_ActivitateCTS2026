package exercitiul7.classes;

public class Facade {



    public void achizitieProdusOnline(int stocProdus, String tipPlata, float suma, String serieFactura, String dataFactura, String numeClient){


        VerificarePlata verificarePlata = new VerificarePlata(tipPlata, suma);
        verificarePlata.verificarePlata();
        GenerareFactura generareFactura = new GenerareFactura(serieFactura, dataFactura);
        generareFactura.generareFactura();
        VerificareStoc vs = new VerificareStoc(stocProdus);
        vs.verificareStocProdus();
        NotificareClient nc = new NotificareClient(numeClient);
        nc.verificareNotificareClient();




    }




}
