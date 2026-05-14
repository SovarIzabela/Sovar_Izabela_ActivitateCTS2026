package exercitiul9.classes;

public class Student implements IObserver{


    private String numeStudent;
    private int varsta;
    private String tipAbonament;


    public Student(String numeStudent, int varsta, String tipAbonament) {
        this.numeStudent = numeStudent;
        this.varsta = varsta;
        this.tipAbonament = tipAbonament;
    }

    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println("Studentul " + numeStudent + " a receptionat mesajul-> " + mesaj);
    }


    @Override
    public String toString() {
        return "Student{" +
                "numeStudent='" + numeStudent + '\'' +
                ", varsta=" + varsta +
                ", tipAbonament='" + tipAbonament + '\'' +
                '}';
    }
}
