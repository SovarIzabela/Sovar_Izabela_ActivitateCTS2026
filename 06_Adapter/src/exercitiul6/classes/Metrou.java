package exercitiul6.classes;

public class Metrou implements Imetrou{

    private String statieMetrou;
    private int pretCalatorie;

    public Metrou(String statieMetrou, int pretCalatorie) {
        this.statieMetrou = statieMetrou;
        this.pretCalatorie = pretCalatorie;
    }

    @Override
    public void valideazaCalatorieMetrou() {
        System.out.println("S-a validat un bilet la Metrou , statia:" + statieMetrou);
    }


    @Override
    public String toString() {
        return "Metrou{" +
                "statieMetrou='" + statieMetrou + '\'' +
                ", pretCalatorie=" + pretCalatorie +
                '}';
    }
}
