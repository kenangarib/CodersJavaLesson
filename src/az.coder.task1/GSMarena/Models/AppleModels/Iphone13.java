package az.coder.task1.GSMarena.Models.AppleModels;

import az.coder.task1.GSMarena.Brand.Apple;
import az.coder.task1.GSMarena.CellPhone;
import az.coder.task1.GSMarena.PhoneFunctions.BackCamera.BackCamera;
import az.coder.task1.GSMarena.PhoneFunctions.BackCamera.BackCameraFunctions;
import az.coder.task1.GSMarena.PhoneFunctions.Body.Body;
import az.coder.task1.GSMarena.PhoneFunctions.Body.BodyFunction;
import az.coder.task1.GSMarena.PhoneFunctions.DateTime;
import az.coder.task1.GSMarena.PhoneFunctions.Network;
import az.coder.task1.GSMarena.Platform.Platform;
import az.coder.task1.GSMarena.Platform.Processors.BionicA;
import az.coder.task1.GSMarena.PhoneFunctions.ScreenPanels.Oled;
import az.coder.task1.GSMarena.PhoneFunctions.ScreenPanels.ScreenPanelFunctions;

public class Iphone13 extends Apple implements BackCameraFunctions, ScreenPanelFunctions, BodyFunction {


    public Iphone13() {
        this.screenPanel = new Oled<Object>("Retina Oled", 60, 400, 1080, 1200, "Ceramic Shield glass", 6.1);
        this.backCamera = new BackCamera<Object>(12, "SonyIMX", 3, 129, 1.8);
        //this.processor = new BionicA<Object>(2.2, "4mm", 8);
        this.platform = new Platform<Object>("IOS", new BionicA<Object>("Bionic", 2.3, 5, 4), "Apple GPU");
        this.dateTime = new DateTime("29.02.2000");
        this.network = new Network<Object>("GSM/CDMA/HSPA/EVDO/LTE/5G");
        this.body = new Body<Object>(146.7 + "x" + 71.5 + "x" + 7.7 + "mm", 174 + "g", "Glass Front", "Nano-SIM,IP68");
    }

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

    @Override
    public void waterProof() {
        System.out.println("IP68");
    }

    @Override
    public void paymentSystem() {

    }

    @Override
    public String toString() {
        return "Iphone13: \n" + screenPanel + backCamera + platform + dateTime + network + body;
    }


}
