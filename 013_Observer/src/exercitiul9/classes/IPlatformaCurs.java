package exercitiul9.classes;

public interface IPlatformaCurs {

    void adaugaStudent(IObserver observer);
    void stergeStudent(IObserver observer);
    void notifica(String mesaj);


}
