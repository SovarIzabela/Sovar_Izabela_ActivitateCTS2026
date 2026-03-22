package exercitiul1.Classes;

public abstract class ANotaDePlata implements Inota{

    private Inota notaPlata;

    public ANotaDePlata(Inota notaPlata) {
        this.notaPlata = notaPlata;
    }

    @Override
    public void printeazaNota() {
        notaPlata.printeazaNota();
    }

    public String getNumeClient(){
        return ((NotaDePlata)notaPlata).getNumeClient();
    }

    public abstract void printeazaFelicitare();

}
