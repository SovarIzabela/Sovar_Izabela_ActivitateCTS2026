package exercitiul5.classes;

public abstract class Decorator implements  Ispital {


    private  Ispital spital;

    public Decorator(Ispital spital) {
        this.spital = spital;
    }

    public String getNumePacient(){
       return ((Spital)spital).getNumePacient();
    }

    @Override
    public void printeazaRezultat() {
        spital.printeazaRezultat();
    }






}
