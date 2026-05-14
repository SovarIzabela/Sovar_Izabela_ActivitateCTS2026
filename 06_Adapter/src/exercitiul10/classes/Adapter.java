package exercitiul10.classes;

public class Adapter implements IaplicatieExistenta{

    private IAplicatieExterna aplicatieExterna;


    public Adapter(IAplicatieExterna aplicatieExterna) {
        this.aplicatieExterna = aplicatieExterna;
    }



    @Override
    public void redaMelodie() {
       aplicatieExterna.playAudio();
    }
}
