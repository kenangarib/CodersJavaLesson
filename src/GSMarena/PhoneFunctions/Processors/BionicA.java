package GSMarena.PhoneFunctions.Processors;

public class BionicA extends Processor {
    public BionicA(Double ghz, String mm, Integer cores) {
        super(ghz, mm, cores);
    }

    public BionicA() {
    }

    @Override
    public String toString() {
        return "BionicA{" +
                "bionicA=" + bionicA +
                '}';
    }
}
