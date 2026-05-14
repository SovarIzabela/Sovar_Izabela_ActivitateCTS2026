package exercitiul9.classes;

public class VerificareBagaj {

    private int greutate;

    public VerificareBagaj(int greutate) {
        this.greutate = greutate;
    }



    public boolean verificareBagaj(){
        if(greutate<=20){
            System.out.println("Bagaj ok!");
            return true;
        }else{
            System.out.println("Greuatea bagajului depaseset limita de 20 kg!");
            return false;
        }

    }



}
