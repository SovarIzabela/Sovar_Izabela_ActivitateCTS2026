package exercitiul8.classes;

public interface IStatieMeteo {

    void adaugaAbonat(IObserver observer);
    void stergeAbonat(IObserver observer);
    void notifica(String mesaj);



}
