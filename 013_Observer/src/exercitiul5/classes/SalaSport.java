package exercitiul5.classes;

import java.util.List;

public class SalaSport implements ISalaSport{


    private String numeSala;
    private List<Iobserver> listaAbonati;

    public SalaSport(String numeSala, List<Iobserver> listaAbonati) {
        this.numeSala = numeSala;
        this.listaAbonati = listaAbonati;
    }

    @Override
    public void adaugaClient(Iobserver iobserver) {
        listaAbonati.add(iobserver);
    }

    @Override
    public void stergeClient(Iobserver iobserver) {
        listaAbonati.remove(iobserver);
    }

    @Override
    public void notificaClient(String mesaj) {

        for(Iobserver abonat: listaAbonati){
            abonat.receptioneazaNotificare(mesaj);
        }

    }


    public void notificareMeciFotbal(){
        notificaClient("S-a adaugat un nou meci de fotbal");
    }

    public void notificareMeciHandbal(){
        notificaClient("S-a adaugat un nou meci de handball");
    }


    public void notificareMediVolei(){
        notificaClient("S-a adaugat un nou meci de volei");
    }

}
