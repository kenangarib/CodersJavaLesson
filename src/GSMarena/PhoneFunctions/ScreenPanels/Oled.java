package GSMarena.PhoneFunctions.ScreenPanels;

public class Oled extends ScreenPanels{
    public Oled(String name, Integer rate, Integer dpi, Integer resolution, Integer nits) {
        super(name, rate, dpi, resolution, nits);
    }

    public Oled() {
    }

    @Override
    public String toString() {
        return "Oled{" +
                "oled=" + oled +
                '}';
    }
}
