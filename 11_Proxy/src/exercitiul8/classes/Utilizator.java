package exercitiul8.classes;

public class Utilizator {


    private String numeUtilizator;

    private boolean areAbonament;


    public Utilizator(String numeUtilizator, boolean areAbonament) {
        this.numeUtilizator = numeUtilizator;
        this.areAbonament = areAbonament;
    }

    public String getNumeUtilizator() {
        return numeUtilizator;
    }

    public boolean isAreAbonament() {
        return areAbonament;
    }

    @Override
    public String toString() {
        return "Utilizator{" +
                "numeUtilizator='" + numeUtilizator + '\'' +
                ", areAbonament=" + areAbonament +
                '}';
    }
}
