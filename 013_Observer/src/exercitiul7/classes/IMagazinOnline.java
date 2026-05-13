package exercitiul7.classes;

public interface IMagazinOnline {

    void adaugaClient(Iobserver iobserver);
    void dezabonareClient(Iobserver iobserver);
    void notificaClient(String mesaj);


}
