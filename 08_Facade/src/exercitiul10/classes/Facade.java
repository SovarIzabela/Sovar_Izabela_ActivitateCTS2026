package exercitiul10.classes;

public class Facade {


    public void doarSpălare(Masina masina, String denumireSpumant, String tipLaveta){
        Spumare spumare = new Spumare(denumireSpumant);
        spumare.spumeaza();
        StergereCuLaveta stergereCuLaveta = new StergereCuLaveta(tipLaveta);

        stergereCuLaveta.stergere();


    }


  public void   spalareCuDegresare(Masina masina,String denumireSpumant, String numeSolutie, int cantitate){
      Spumare spumare = new Spumare(denumireSpumant);
      spumare.spumeaza();
      Degresare degresare = new Degresare(numeSolutie, cantitate);
      degresare.degreseaza();
    }


  public void  SpălareCuSpuma(Masina masina,String denumireSpumant, String tipLaveta){
      Spumare spumare = new Spumare(denumireSpumant);
      spumare.spumeaza();
      StergereCuLaveta stergereCuLaveta = new StergereCuLaveta(tipLaveta);

      stergereCuLaveta.stergere();
    }




}
