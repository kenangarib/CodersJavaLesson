package az.coder.task1.GSMarena.PhoneFunctions.ScreenPanels;





public class ScreenPanels  implements ScreenPanelFunctions {


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
        super();

    }

    @Override
    public void edge() {

    }

    @Override
    public void protector() {

    }


    @Override
    public String toString() {
        return
                "\nName: " + name +  " \nRate: " + rate + " \nDpi: " + dpi + " \nResolution: " + resolution + " \nNits: " + nits;
    }
}
