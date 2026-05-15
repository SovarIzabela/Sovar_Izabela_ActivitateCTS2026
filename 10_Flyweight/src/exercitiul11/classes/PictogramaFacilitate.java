package exercitiul11.classes;



public class PictogramaFacilitate implements AbstractPictogramaFacilitate{


    private String tipPictograma;
    private String culoare;

    public PictogramaFacilitate(String tipPictograma, String culoare) {
        this.tipPictograma = tipPictograma;
        this.culoare = culoare;
    }

    @Override
    public void afiseaza(int x, int y, String eticheta) {
        System.out.println(this.toString() +"Pozitia x :" +  x +" Pozitia Y"+ y + "eticheta" + eticheta);
    }

    @Override
    public String toString() {
        return "PictogramaFacilitate{" +
                "tipPictograma='" + tipPictograma + '\'' +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}
