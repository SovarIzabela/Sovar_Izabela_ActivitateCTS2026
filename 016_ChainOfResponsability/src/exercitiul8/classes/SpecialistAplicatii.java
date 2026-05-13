package exercitiul8.classes;

public class SpecialistAplicatii extends AEchipaSuport{
    @Override
    public void repartizeazaTichete(Tichet tichet) {
        if(tichet.getDificultate()>=7 && tichet.getDificultate()<=9){
            System.out.println("Tichetul a fost repartizat unui Specialist Aplicatii");
        }else{
            super.getUrmator().repartizeazaTichete(tichet);
        }
    }
}
