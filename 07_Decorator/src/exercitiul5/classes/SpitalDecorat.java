package exercitiul5.classes;

public class SpitalDecorat extends Decorator{
    public SpitalDecorat(Ispital spital) {
        super(spital);
    }

    @Override
    public void printeazaRezultat() {
        super.printeazaRezultat();
        System.out.println("S-au generat si rezultatele Online pentru pacietul " + super.getNumePacient());
    }






}
