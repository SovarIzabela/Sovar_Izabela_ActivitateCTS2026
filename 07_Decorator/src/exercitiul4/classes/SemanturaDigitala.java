package exercitiul4.classes;

public class SemanturaDigitala extends ACertificatDecorat {
    public SemanturaDigitala(Icertificat icertificat) {
        super(icertificat);
    }


    @Override
    public void emiteCertificat() {
        super.emiteCertificat();
        System.out.println("S-a emis semnatura digitala!");
    }
}
