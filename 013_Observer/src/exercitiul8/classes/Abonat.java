package exercitiul8.classes;

public class Abonat implements IObserver{

    private String numeAbonat;


    public Abonat(String numeAbonat) {
        this.numeAbonat = numeAbonat;
    }

    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println("Userul " + numeAbonat + " a receptionat mesajul : " + mesaj);
    }
}
