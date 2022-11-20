package az.coder.task1.GSMarena.PhoneFunctions.Processors;

public class Exynoss extends Processor {
    public Exynoss(Double ghz, String mm, Integer cores) {
        super(ghz, mm, cores);
    }

    public Exynoss() {
    }

    @Override
    public String toString() {
        return "Exynoss{" +
                "exynoss=" + exynoss +
                '}';
    }
}
