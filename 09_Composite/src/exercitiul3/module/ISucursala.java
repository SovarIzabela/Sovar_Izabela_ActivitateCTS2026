package exercitiul3.module;

public interface ISucursala {


    void adaugaNod(ISucursala nod) throws Exception;
    void getNod(int index) throws Exception;
    void stergeNod(ISucursala nod) throws Exception;
    void descriere(String indent);



}
