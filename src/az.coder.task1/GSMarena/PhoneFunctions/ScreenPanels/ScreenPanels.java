package az.coder.task1.GSMarena.PhoneFunctions.ScreenPanels;





public class ScreenPanels <T> implements ScreenPanelFunctions {


    T name;
    T rate;
    T dpi;
    T resolution;
    T nits;


    public ScreenPanels(T name,T rate, T dpi, T resolution, T nits) {
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
                "\nScreen Panel\n " + "Name: " + name +  ",  Rate: " + rate + ",  Dpi: " + dpi + ",  Resolution: " + resolution + ",  Nits: " + nits;
    }
}
