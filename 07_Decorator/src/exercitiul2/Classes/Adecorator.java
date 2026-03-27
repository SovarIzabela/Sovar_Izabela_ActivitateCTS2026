package exercitiul2.Classes;

public abstract class Adecorator implements Ibon{

    private Ibon bon;

   public abstract void printeazaFelicitare();

    public Adecorator(Ibon bon) {
        this.bon = bon;
    }

    @Override
    public void printeazaBon() {
        bon.printeazaBon();
    }
}
