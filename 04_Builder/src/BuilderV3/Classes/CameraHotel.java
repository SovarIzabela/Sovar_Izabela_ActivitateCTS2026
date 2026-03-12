package BuilderV3.Classes;

public class CameraHotel {

    private boolean arePatDublu;
    private boolean areVedereLaMare;
    private boolean areAerConditionat;

    private CameraHotel(CameraHotelBuilder builder) {
        this.arePatDublu = builder.arePatDublu;
        this.areVedereLaMare = builder.areVedereLaMare;
        this.areAerConditionat = builder.areAerConditionat;
    }

    public void setArePatDublu(boolean arePatDublu) {
        this.arePatDublu = arePatDublu;
    }

    public void setAreVedereLaMare(boolean areVedereLaMare) {
        this.areVedereLaMare = areVedereLaMare;
    }

    public void setAreAerConditionat(boolean areAerConditionat) {
        this.areAerConditionat = areAerConditionat;
    }


    public static CameraHotelBuilder builder(){
        return new CameraHotelBuilder();
    }

    public static class CameraHotelBuilder implements IBuilder{

        private boolean arePatDublu;
        private boolean areVedereLaMare;
        private boolean areAerConditionat;

        public CameraHotelBuilder setArePatDublu(boolean arePatDublu) {
            this.arePatDublu = arePatDublu;
            return this;
        }

        public CameraHotelBuilder setAreVedereLaMare(boolean areVedereLaMare) {
            this.areVedereLaMare = areVedereLaMare;
            return this;
        }

        public CameraHotelBuilder setAreAerConditionat(boolean areAerConditionat) {
            this.areAerConditionat = areAerConditionat;
            return this;
        }



        @Override
        public CameraHotel build() {
            return new CameraHotel(this);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CameraHotel{");
        sb.append("arePatDublu=").append(arePatDublu);
        sb.append(", areVedereLaMare=").append(areVedereLaMare);
        sb.append(", areAerConditionat=").append(areAerConditionat);
        sb.append('}');
        return sb.toString();
    }
}
