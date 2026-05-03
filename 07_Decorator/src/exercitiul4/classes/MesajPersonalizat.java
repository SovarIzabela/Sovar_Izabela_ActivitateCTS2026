package exercitiul4.classes;

public class MesajPersonalizat extends ACertificatDecorat{
    public MesajPersonalizat(Icertificat icertificat) {
        super(icertificat);
    }

    @Override
    public void emiteCertificat() {
        super.emiteCertificat();
        System.out.println("S-a emis mesajul personalizat!");
    }
}
