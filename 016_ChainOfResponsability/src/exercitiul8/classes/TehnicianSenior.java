package exercitiul8.classes;

public class TehnicianSenior extends AEchipaSuport{
    @Override
    public void repartizeazaTichete(Tichet tichet) {
        if(tichet.getDificultate()>=4 && tichet.getDificultate()<=6){
            System.out.println("Tichetul a fost repartizat Tehnician Senior");
        }else{
            super.getUrmator().repartizeazaTichete(tichet);
        }
    }
}
