package az.coder.task1.GSMarena.PhoneFunctions.Processors;


import az.coder.task1.GSMarena.CellPhone;

public class Processor <T> extends CellPhone {



    T ghz;
    T mm;
    T cores;

    public Processor(T ghz, T mm, T cores) {
        this.ghz = ghz;
        this.mm = mm;
        this.cores = cores;
    }
    public Processor() {
super();
    }

    @Override
    public String toString() {
        return "\nProcessor\n " + "GHZ: " + ghz + ", mm: " + mm  + ", Cores: " + cores;
    }
}
