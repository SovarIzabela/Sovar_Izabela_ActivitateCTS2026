package exercitiul6.classes;

public class BiletDecorat extends ABiletDecorat{
    public BiletDecorat(IBiletCalatorie biletCalatorie) {
        super(biletCalatorie);
    }


    @Override
    public void printeazaBilet() {
        super.printeazaBilet();
        System.out.println(" La multi ani!");
    }
}
