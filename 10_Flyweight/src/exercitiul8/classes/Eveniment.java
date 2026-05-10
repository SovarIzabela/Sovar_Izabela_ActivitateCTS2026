package exercitiul8.classes;

public class Eveniment implements Ieveniment{

    private String artist;
    private String locatieEevniment;
    private String dataEevniment;

    public Eveniment(String artist, String locatieEevniment, String dataEevniment) {
        this.artist = artist;
        this.locatieEevniment = locatieEevniment;
        this.dataEevniment = dataEevniment;
    }




    @Override
    public void descriere(ElementeOptionale optionale) {
        System.out.println(this.toString()+ optionale.toString());
    }

    @Override
    public String toString() {
        return "Eveniment{" +
                "artist='" + artist + '\'' +
                ", locatieEevniment='" + locatieEevniment + '\'' +
                ", dataEevniment='" + dataEevniment + '\'' +
                '}';
    }
}
