package az.coder.task1.BOXgeneric;

public class RTX3060 extends BoxGeneric{
    public RTX3060(Object ghz, Object vRam) {
        super(ghz, vRam);
    }

    @Override
    public String toString() {
        return "RTX3060{" +
                "ghz=" + ghz +
                ", vRam=" + vRam +
                '}';
    }
}
