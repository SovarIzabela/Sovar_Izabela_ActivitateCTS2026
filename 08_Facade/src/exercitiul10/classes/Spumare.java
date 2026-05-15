package exercitiul10.classes;

public class Spumare {

    private String denumireSpumant;


    public Spumare(String denumireSpumant) {
        this.denumireSpumant = denumireSpumant;
    }


    public void spumeaza(){
        System.out.println("A fost adaugata spuma " + denumireSpumant);
    }



}
