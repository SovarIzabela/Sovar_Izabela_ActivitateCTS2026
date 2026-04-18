package Exercitiul1.classes;

public interface ISpital {


    void adaugaPacient(IObserver pacient);
    void stergePacient(IObserver pacient);
    void trimiteNotificare(String mesaj);


}
