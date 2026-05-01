package exercitiul3.classes;

public interface IRestaurant {

    void adaugaClient(Iobserver iobserver);
    void stergeClient(Iobserver iobserver);
    void notificaClient(String mesaj);

}
