package exercitiul6.classes;

import java.util.List;

public class Biblioteca implements IBiblioteca{


    private String numeBiblioteca;

    private List<Iobserver> listaCititori;

    public Biblioteca(String numeBiblioteca, List<Iobserver> listaCititori) {
        this.numeBiblioteca = numeBiblioteca;
        this.listaCititori = listaCititori;
    }

    @Override
    public void adaugaCititor(Iobserver observer) {
        listaCititori.add(observer);
    }

    @Override
    public void stergeCititor(Iobserver observer) {
        listaCititori.remove(observer);
    }

    public void notificaCititor(String mesaj) {

        for(Iobserver cititor:listaCititori){
            cititor.receptineazaMesaj(mesaj);
        }

    }


    public void notificaCarteNoua(){
        notificaCititor("A aparut o carte noua !");
    }



}
