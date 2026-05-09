package exercitiul6.classes;



public abstract class ABiletDecorat implements IBiletCalatorie {


    private IBiletCalatorie biletCalatorie;

    public ABiletDecorat(IBiletCalatorie biletCalatorie) {
        this.biletCalatorie = biletCalatorie;
    }

    @Override
    public void printeazaBilet() {
        biletCalatorie.printeazaBilet();
    }
}