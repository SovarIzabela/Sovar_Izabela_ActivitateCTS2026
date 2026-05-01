package exercitiul1.classes;

public class ContCurent extends Acont{




    @Override
    public void plateste(Cont cont, float suma) {
        if(cont.getSuma()>suma){
            System.out.println("A fost platita suma " + suma + " din contul curent");
        }else{

        super.getCont().plateste(cont, suma);
        }
    }
}
