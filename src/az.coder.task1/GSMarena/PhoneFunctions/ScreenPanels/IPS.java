package az.coder.task1.GSMarena.PhoneFunctions.ScreenPanels;

public class IPS extends ScreenPanels{
    public IPS(String name, Integer rate, Integer dpi, Integer resolution, Integer nits) {
        super(name, rate, dpi, resolution, nits);
    }

    public IPS() {
    }

    @Override
    public String toString() {
        return "IPS{" +
                "ips=" + ips +
                '}';
    }
}
