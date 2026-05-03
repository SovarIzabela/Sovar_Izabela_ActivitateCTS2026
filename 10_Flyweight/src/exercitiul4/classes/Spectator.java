package exercitiul4.classes;

public class Spectator implements Ispectator{


    private int id;
    private int inaltime;
    private int latime;

    public Spectator(int id, int inaltime, int latime) {
        this.id = id;
        this.inaltime = inaltime;
        this.latime = latime;
    }

    @Override
    public String toString() {
        return "Spectator{" +
                "id=" + id +
                ", inaltime=" + inaltime +
                ", latime=" + latime +
                '}';
    }

    @Override
    public void descriere(ElemOptionale optionale) {
        System.out.println(this.toString() + optionale.toString());
    }
}
