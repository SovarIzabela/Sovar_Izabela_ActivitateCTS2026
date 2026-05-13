package exercitiul8.classes;

public class TehnicianJunior extends AEchipaSuport{
    @Override
    public void repartizeazaTichete(Tichet tichet) {
        if(tichet.getDificultate()>=1 && tichet.getDificultate()<=3){
            System.out.println("Tichetul a fost repartizat Tehnician Junior");
        }else{
            super.getUrmator().repartizeazaTichete(tichet);
        }
    }
}
