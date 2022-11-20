package az.coder.task1.GSMarena.PhoneFunctions.Processors;


import az.coder.task1.GSMarena.CellPhone;

public class Processor extends CellPhone {



    Double ghz;
    String mm;
    Integer cores;

    public Processor(Double ghz, String mm, Integer cores) {
        this.ghz = ghz;
        this.mm = mm;
        this.cores = cores;
    }
    public Processor() {
super();
    }

    @Override
    public String toString() {
        return "Processor{" +
                "ghz=" + ghz +
                ", mm='" + mm + '\'' +
                ", cores=" + cores +
                '}';
    }
}
