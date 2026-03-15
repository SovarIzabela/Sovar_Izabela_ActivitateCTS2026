package BuilderV3.Exercitiul2.Classes;

import java.util.ArrayList;
import java.util.List;

public class Masina extends AMasina{

    private Masina(Builder builder){
        this.marca = builder.marca;
        this.sasiu= builder.sasiu;
        this.listaMesaje = new ArrayList<>(builder.listaMesaje);
    }

    @Override
    public void addMesaj(String mesaj) {
            this.listaMesaje.add(mesaj);
    }

    public static Builder builder(){
        return new Builder();
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", sasiu='").append(sasiu).append('\'');
        sb.append(", listaMesaje=").append(listaMesaje);
        sb.append('}');
        return sb.toString();
    }


    public static class Builder implements IBuilder{

        protected String marca;
        protected String sasiu;
        protected List<String> listaMesaje =new ArrayList<>();


        public Builder setMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public Builder setSasiu(String sasiu) {
            this.sasiu = sasiu;
            return this;
        }

        public Builder setListaMesaje(List<String> listaMesaje) {
            this.listaMesaje = listaMesaje;
            return this;
        }


        @Override
        public Masina build() {
            return new Masina(this);
        }
    }




}
