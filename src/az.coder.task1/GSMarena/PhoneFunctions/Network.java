package az.coder.task1.GSMarena.PhoneFunctions;

public class Network<T> {
    T technology;

    public Network(T technology) {
        this.technology = technology;
    }

    @Override
    public String toString() {
        return "\nNetwork: " + technology;
    }
}
