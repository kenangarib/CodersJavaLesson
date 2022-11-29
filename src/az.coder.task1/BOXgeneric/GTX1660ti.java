package az.coder.task1.BOXgeneric;

public class GTX1660ti extends BoxGeneric{
    public GTX1660ti(Object ghz, Object vRam) {
        super(ghz, vRam);
    }

    @Override
    public String toString() {
        return "GTX1660ti{" +
                "ghz=" + ghz +
                ", vRam=" + vRam +
                '}';
    }
}
