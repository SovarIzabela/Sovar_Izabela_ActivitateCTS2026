package exercitiul1.classes;

public class Cont3 extends Acont{




    @Override
    public void plateste(Cont cont, float suma) {
        if(cont.getSuma()>suma){
            System.out.println("A fost platita suma " + suma + " din contul 3");
        }else{

        System.out.println("Nu aveti fonduri suficiente pentru a efectua plata!");
        }
    }
}
