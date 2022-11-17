package GSMarena.PhoneFunctions.BackCamera;

import GSMarena.CellPhone;

public class BackCamera extends CellPhone implements BackCameraFunctions {
    Integer megaPixel;
    String model;
    Integer zoom;
    Integer wideAngle;
    Double diafram;

    public BackCamera(Integer megaPixel, String model, Integer zoom, Integer wideAngle, Double diafram) {
        this.megaPixel = megaPixel;
        this.model = model;
        this.zoom = zoom;
        this.wideAngle = wideAngle;
        this.diafram = diafram;
    }
    public BackCamera(){

    }

    @Override
    public void oisSupport() {

    }

    @Override
    public void laserSensor() {

    }

    @Override
    public void deepSensor() {

    }

    @Override
    public void lidarSensor() {

    }

    @Override
    public void tofSensor() {

    }

    @Override
    public void flashLight() {

    }
}
