package az.coder.task1.task16;

public abstract class Employer<T> {
    T name;

    public Employer(T name) {
        this.name = name;
    }

    public Employer() {

    }

    @Override
    public String toString() {
        return name + "";
    }
}
