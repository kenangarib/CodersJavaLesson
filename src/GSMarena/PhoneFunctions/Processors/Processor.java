package GSMarena.PhoneFunctions.Processors;

import GSMarena.CellPhone;

public class Processor extends CellPhone {

    Exynoss exynoss = new Exynoss();
    BionicA bionicA = new BionicA();
    Snapdragon snapdragon = new Snapdragon();

    Double ghz;
    String mm;
    Integer cores;

    public Processor(Double ghz, String mm, Integer cores) {
        this.ghz = ghz;
        this.mm = mm;
        this.cores = cores;
    }
    public Processor() {

    }

    @Override
    public String toString() {
        return "Processor{" +
                "exynoss=" + exynoss +
                ", bionicA=" + bionicA +
                ", snapdragon=" + snapdragon +
                ", ghz=" + ghz +
                ", mm='" + mm + '\'' +
                ", cores=" + cores +
                '}';
    }
}
