package BuilderV3.Exercitiul3.Classes;

public class Pizza {

    private String tipAluat;
    private int dimensiune;
    private boolean extraBranza;
    private boolean areMasline;
    private boolean areSosPicant;

    private Pizza(Builder builder) {
        this.tipAluat = builder.tipAluat;
        this.dimensiune = builder.dimensiune;
        this.extraBranza = builder.extraBranza;
        this.areSosPicant = builder.areSosPicant;
        this.areMasline = builder.areMasline;
    }

    public void setTipAluat(String tipAluat) {
        this.tipAluat = tipAluat;
    }

    public void setDimensiune(int dimensiune) {
        this.dimensiune = dimensiune;
    }

    public void setExtraBranza(boolean extraBranza) {
        this.extraBranza = extraBranza;
    }

    public void setAreMasline(boolean areMasline) {
        this.areMasline = areMasline;
    }

    public void setAreSosPicant(boolean areSosPicant) {
        this.areSosPicant = areSosPicant;
    }

    public static Builder builder(String tipAluat, int dimensiune){
        return new Builder(tipAluat, dimensiune);
    }

    public static class Builder implements Ibuild{


        private String tipAluat;
        private int dimensiune;
        private boolean extraBranza;
        private boolean areMasline;
        private boolean areSosPicant;

        public Builder(String tipAluat, int dimensiune) {
            this.tipAluat = tipAluat;
            this.dimensiune= dimensiune;
        }

        public Builder setTipAluat(String tipAluat) {
            this.tipAluat = tipAluat;
            return this;
        }

        public Builder setDimensiune(int dimensiune) {
            this.dimensiune = dimensiune;
            return this;
        }

        public Builder setExtraBranza(boolean extraBranza) {
            this.extraBranza = extraBranza;
            return this;
        }

        public Builder setAreMasline(boolean areMasline) {
            this.areMasline = areMasline;
            return this;
        }

        public Builder setAreSosPicant(boolean areSosPicant) {
            this.areSosPicant = areSosPicant;
            return this;
        }


        @Override
        public Pizza build() {
            return new Pizza(this);
        }
    }






    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pizza{");
        sb.append("tipAluat='").append(tipAluat).append('\'');
        sb.append(", dimensiune=").append(dimensiune);
        sb.append(", extraBranza=").append(extraBranza);
        sb.append(", areMasline=").append(areMasline);
        sb.append(", areSosPicant=").append(areSosPicant);
        sb.append('}');
        return sb.toString();
    }
}
