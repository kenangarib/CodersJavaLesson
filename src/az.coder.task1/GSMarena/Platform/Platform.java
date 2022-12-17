package az.coder.task1.GSMarena.Platform;

import az.coder.task1.GSMarena.CellPhone;
import az.coder.task1.GSMarena.Platform.Processors.BionicA;

public class Platform<T> extends CellPhone {
    T os;
    BionicA<Object> processor;
    T Gpu;

    public Platform(T os, BionicA<Object> processor, T gpu) {
        this.os = os;
        this.processor = processor;
        Gpu = gpu;
    }
    public Platform() {

    }

    @Override
    public String toString() {
        return "\nPlatform: " + "OS: " + os + ", Processor:\n " + processor + ", GPU: " + Gpu;
    }
}
