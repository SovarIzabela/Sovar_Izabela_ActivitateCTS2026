package exercitiul10.classes;

public class ProxyCurs implements AbstractCurs{

    private Curs curs;


    public ProxyCurs(Curs curs) {
        this.curs = curs;
    }

    @Override
    public void afiseazaContinut(String tipUtilizator) {
        if(tipUtilizator.equals("student")){
            System.out.println("Cursul "+ curs.getNumeCurs()+"nu poate fi accesat de student!");
        } else if (tipUtilizator.equals("student premium")) {
            System.out.println("Cursul "+ curs.getNumeCurs()+" poate fi accesat de student premium!");
        }else{
            System.out.println("Cursul "+ curs.getNumeCurs()+" poate fi accesat de cadru didactic");
        }
    }
}
