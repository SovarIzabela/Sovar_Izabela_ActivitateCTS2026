package Main;



import Classes.RezervareBilet;

public class Main{

    public static void main(String[] args) {

        RezervareBilet c1 = RezervareBilet.getInstance();
        System.out.println(c1);
        RezervareBilet c2 = RezervareBilet.getInstance();
        System.out.println(c2);



    }

}