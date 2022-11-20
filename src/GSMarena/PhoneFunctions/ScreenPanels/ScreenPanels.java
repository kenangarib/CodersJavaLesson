package GSMarena.PhoneFunctions.ScreenPanels;

import GSMarena.Brand.Brand;
//import GSMarena.Models.Model;

public class ScreenPanels extends Brand implements ScreenPanelFunctions {

    Amoled amoled = new Amoled();
    Oled oled = new Oled();
    IPS ips = new IPS();

    String name;
    Integer rate;
    Integer dpi;
    Integer resolution;
    Integer nits;


    public ScreenPanels(String name,Integer rate, Integer dpi, Integer resolution, Integer nits) {
        this.name = name;
        this.rate = rate;
        this.dpi = dpi;
        this.resolution = resolution;
        this.nits = nits;
    }

    public ScreenPanels() {

    }

    @Override
    public void edge() {

    }

    @Override
    public void protector() {

    }

    @Override
    public String toString() {
        return "ScreenPanels{" +
                "amoled=" + amoled +
                ", oled=" + oled +
                ", ips=" + ips +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                ", dpi=" + dpi +
                ", resolution=" + resolution +
                ", nits=" + nits +
                '}';
    }
}
