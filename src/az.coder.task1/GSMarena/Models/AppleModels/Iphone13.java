package az.coder.task1.GSMarena.Models.AppleModels;

import az.coder.task1.GSMarena.Brand.Apple;
import az.coder.task1.GSMarena.PhoneFunctions.BackCamera.BackCamera;
import az.coder.task1.GSMarena.PhoneFunctions.BackCamera.BackCameraFunctions;
import az.coder.task1.GSMarena.PhoneFunctions.Processors.BionicA;
import az.coder.task1.GSMarena.PhoneFunctions.ScreenPanels.Oled;
import az.coder.task1.GSMarena.PhoneFunctions.ScreenPanels.ScreenPanelFunctions;

public class Iphone13 extends Apple implements BackCameraFunctions, ScreenPanelFunctions {


    public Iphone13(Integer memorySize, Integer ramSIZE) {
        this.RAM=ramSIZE;
        this.memory=memorySize;
        this.screenPanel=new Oled("Retina Oled",60,400,1080,1200);
        this.backCamera=new BackCamera(12,"SonyIMX",3,129,1.8);
        this.processor=new BionicA(2.2,"4mm",8);
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
    public String toString() {
        return "Iphone13: \n"  + screenPanel +
                ", backCamera=" + backCamera +
                ", processor=" + processor +
                ", RAM=" + RAM +
                ", memory=" + memory +
                '}';
    }
}
