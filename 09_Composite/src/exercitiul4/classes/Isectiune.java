package exercitiul4.classes;

public interface Isectiune {

    void adaugaNod(Isectiune nod) throws Exception;
    void getNod(int index) throws Exception;
    void stergeNod(Isectiune nod) throws Exception;
    void descriere(String indent);


}
