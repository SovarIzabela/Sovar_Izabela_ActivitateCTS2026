package exercitiul1.classes;

public class Cont2 extends Acont{

    @Override
    public void plateste(Cont cont, float suma) {
        if(cont.getSuma()>suma){
            System.out.println("A fost platita suma " + suma + " din contul 2");
        }else{

        super.getCont().plateste(cont, suma);
        }
    }
}
