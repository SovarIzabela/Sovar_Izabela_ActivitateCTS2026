package exercitiul4.classes;

public class BadgeExcelenta extends ACertificatDecorat {
    public BadgeExcelenta(Icertificat icertificat) {
        super(icertificat);
    }


    @Override
    public void emiteCertificat() {
        super.emiteCertificat();
        System.out.println("S-a emis badge-ul de excelenta!");
    }
}
