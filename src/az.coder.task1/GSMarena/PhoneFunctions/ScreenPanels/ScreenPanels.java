package az.coder.task1.GSMarena.PhoneFunctions.ScreenPanels;


import java.util.LinkedList;

public class ScreenPanels<T> implements ScreenPanelFunctions {


    T type;
    T rate;
    T dpi;
    T resolution;
    T nits;
    T protection;
    T size;


    public ScreenPanels(T type, T rate, T dpi, T resolution, T nits, T protection, T size) {
        this.type = type;
        this.rate = rate;
        this.dpi = dpi;
        this.resolution = resolution;
        this.nits = nits;
        this.protection = protection;
        this.size = size;
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
                "\nScreen Panel\n " + "Type: " + type + ",  Rate: " + rate +" hz"+ ",  Dpi: " + dpi +
                 ",  Resolution: " + resolution   + ", Size: " + size + " inches" +  ",  Nits: " + nits +", Protection: " + protection;
    }
}
