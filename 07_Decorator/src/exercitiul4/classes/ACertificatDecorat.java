package exercitiul4.classes;

public abstract class ACertificatDecorat implements Icertificat {

    private Icertificat icertificat;

    public ACertificatDecorat(Icertificat icertificat) {
        this.icertificat = icertificat;
    }

    @Override
    public void emiteCertificat() {
        icertificat.emiteCertificat();
    }




}
