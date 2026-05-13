package exercitiul6.classes;

public interface IBiblioteca {

    void adaugaCititor(Iobserver observer);
    void stergeCititor(Iobserver observer);
    void notificaCititor(String mesaj);


}
