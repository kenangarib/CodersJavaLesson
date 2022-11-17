package GSMarena.Models.AppleModels;

import GSMarena.PhoneFunctions.BackCamera.BackCamera;
import GSMarena.PhoneFunctions.BackCamera.BackCameraFunctions;
import GSMarena.Brand.Apple;
import GSMarena.PhoneFunctions.Processors.BionicA;
import GSMarena.PhoneFunctions.Processors.Processor;
import GSMarena.PhoneFunctions.ScreenPanels.Oled;
import GSMarena.PhoneFunctions.ScreenPanels.ScreenPanelFunctions;
import GSMarena.PhoneFunctions.ScreenPanels.ScreenPanels;

public class Iphone13 extends Apple implements BackCameraFunctions, ScreenPanelFunctions {
    ScreenPanels oled = new Oled("Retina Oled",60,400,1080,1200);
    BackCamera backCamera = new BackCamera(12,"SonyIMX",3,129,1.8);
    Processor bionicA = new BionicA(2.2,"4mm",8);

    @Override
    public void oisSupport() {
        System.out.println("Var");
    }

    @Override
    public void laserSensor() {

    }

    @Override
    public void deepSensor() {

    }

    @Override
    public void lidarSensor() {
        System.out.println("Var");

    }

    @Override
    public void tofSensor() {

    }

    @Override
    public void flashLight() {
        System.out.println("Var");

    }

    @Override
    public void edge() {
        System.out.println("Yoxdur");
    }

    @Override
    public void protector() {
        System.out.println("Var");
    }
}
