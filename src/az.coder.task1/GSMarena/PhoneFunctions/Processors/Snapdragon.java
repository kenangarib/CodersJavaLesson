package az.coder.task1.GSMarena.PhoneFunctions.Processors;

public class Snapdragon extends Processor {
    public Snapdragon(Double ghz, String mm, Integer cores) {
        super(ghz, mm, cores);
    }

    public Snapdragon() {
    }

    @Override
    public String toString() {
        return "Snapdragon{" +
                "snapdragon=" + snapdragon +
                '}';
    }
}
