package exercitiul6.classes;

public class Personal implements IPersonal{
    @Override
    public void curataCamera() {
        System.out.println("S-a curatat camera!");
    }

    @Override
    public void pregatireMicDejun() {
        System.out.println("S-a pregatit micul dejun!");
    }

    @Override
    public void reparareDefectiune() {
        System.out.println("S-a reparat defectiunea!");
    }
}
