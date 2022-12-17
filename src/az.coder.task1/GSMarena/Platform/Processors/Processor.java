package az.coder.task1.GSMarena.Platform.Processors;


import az.coder.task1.GSMarena.CellPhone;
import az.coder.task1.GSMarena.Platform.Platform;

public class Processor<T> extends Platform {


    T name;
    T ghz;
    T mm;
    T cores;

    public Processor(T name, T ghz, T mm, T cores) {
        this.name = name;
        this.ghz = ghz;
        this.mm = mm;
        this.cores = cores;
    }

    public Processor() {
        super();
    }

    @Override
    public String toString() {
        return " Name: " + name + ", GHZ: " + ghz + ", Size: " + mm + "mm" + ", Cores: " + cores;
    }
}
