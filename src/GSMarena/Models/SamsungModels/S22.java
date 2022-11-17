package GSMarena.Models.SamsungModels;

import GSMarena.PhoneFunctions.BackCamera.BackCamera;
import GSMarena.PhoneFunctions.BackCamera.BackCameraFunctions;
import GSMarena.Brand.Samsung;
import GSMarena.PhoneFunctions.Processors.Exynoss;
import GSMarena.PhoneFunctions.Processors.Processor;
import GSMarena.PhoneFunctions.ScreenPanels.Amoled;
import GSMarena.PhoneFunctions.ScreenPanels.ScreenPanelFunctions;
import GSMarena.PhoneFunctions.ScreenPanels.ScreenPanels;

public class S22 extends Samsung implements BackCameraFunctions, ScreenPanelFunctions {

    ScreenPanels amoled = new Amoled("Dynamic Amoled 2x",120,450,1920,1800);
    BackCamera backCamera = new BackCamera(108,"SamsungSensor",10,129,1.7);
    Processor exynos = new Exynoss(2.4,"4mm",8);

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

    }

    @Override
    public void tofSensor() {

        System.out.println("Var");
    }

    @Override
    public void flashLight() {
        System.out.println("Var");

    }

    @Override
    public void edge() {
        System.out.println("Var");
    }

    @Override
    public void protector() {
        System.out.println("Var");
    }
}
