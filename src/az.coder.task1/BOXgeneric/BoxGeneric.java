package az.coder.task1.BOXgeneric;

public class BoxGeneric<T> {


    T t;


    public BoxGeneric(T t) {
        this.t = t;
    }

    public BoxGeneric(){

    }

    @Override
    public String toString() {
        return t.toString();
    }
}
