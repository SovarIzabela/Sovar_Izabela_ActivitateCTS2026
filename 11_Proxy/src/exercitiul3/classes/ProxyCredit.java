package exercitiul3.classes;

public class ProxyCredit implements Icredit{

    private Credit credit;

    public ProxyCredit(Credit credit) {
        this.credit = credit;
    }

    @Override
    public void acordaCredit() {
        if(credit.getMoneda().equals("RON")){
            credit.acordaCredit();
        }else{
            System.out.println("Nu se poate acorda credit in alte monede decat RON");
        }

    }
}
