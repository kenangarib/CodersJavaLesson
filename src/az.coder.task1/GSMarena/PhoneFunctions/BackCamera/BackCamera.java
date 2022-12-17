package az.coder.task1.GSMarena.PhoneFunctions.BackCamera;


import az.coder.task1.GSMarena.CellPhone;

public class BackCamera<T> extends CellPhone implements BackCameraFunctions {
    T megaPixel;
    T model;
    T zoom;
    T wideAngle;
    T diafram;

    public BackCamera(T megaPixel, T model, T zoom, T wideAngle, T diafram) {
        this.megaPixel = megaPixel;
        this.model = model;
        this.zoom = zoom;
        this.wideAngle = wideAngle;
        this.diafram = diafram;
    }
    public BackCamera(){
super();
    }

    @Override
    public String toString() {
        return "\nBackCamera\n " + "Megapixel: " + megaPixel + ", Camera model: " + model +  ", Zoom: " + zoom + ", WideAngle: " + wideAngle + ", Diafram: " + diafram;
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
