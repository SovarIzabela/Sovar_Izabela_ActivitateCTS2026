package exercitiul2.classes;

public abstract class AVanzareMedicamente {

    protected int idReteta;

    public AVanzareMedicamente(int idReteta) {
        this.idReteta = idReteta;
    }

    public int getIdReteta() {
        return idReteta;
    }

    public abstract void primireReteta();

    public abstract boolean verificareStoc();
   public  abstract  void inacseazaBanii();

   public  abstract void scadeStoc();

   public abstract void emiteBon();

    public abstract void aducereMed();

    public final void vindeMedicamente(){
        primireReteta();

        if(verificareStoc()==false){
            System.out.println("Nu este stoc pentru acest medicament");
            return;
        }
        verificareStoc();
        inacseazaBanii();
        scadeStoc();
        aducereMed();
        emiteBon();
    }

}
