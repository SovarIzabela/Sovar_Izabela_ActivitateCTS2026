package BuilderV3.Main;

import BuilderV3.Classes.CameraHotel;

public class Main {

    public static void main(String[] args){

        CameraHotel camera1 = CameraHotel.builder().setAreAerConditionat(true).build();
        System.out.println(camera1);

    }

}
