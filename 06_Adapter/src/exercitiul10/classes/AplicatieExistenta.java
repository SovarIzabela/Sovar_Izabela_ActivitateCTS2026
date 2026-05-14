package exercitiul10.classes;

public class AplicatieExistenta implements IaplicatieExistenta{


    private String numeMelodie;
    private String artist;
    private String gen;

    public AplicatieExistenta(String numeMelodie, String artist, String gen) {
        this.numeMelodie = numeMelodie;
        this.artist = artist;
        this.gen = gen;
    }

    @Override
    public void redaMelodie() {
        System.out.println("Se reda melodia : " + numeMelodie+ ", artist " + artist);
    }

    @Override
    public String toString() {
        return "AplicatieExistenta{" +
                "numeMelodie='" + numeMelodie + '\'' +
                ", artist='" + artist + '\'' +
                ", gen='" + gen + '\'' +
                '}';
    }
}
