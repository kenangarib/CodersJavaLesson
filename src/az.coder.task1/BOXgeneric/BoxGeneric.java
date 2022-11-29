package az.coder.task1.BOXgeneric;

public class BoxGeneric<T> {


    T ghz;
    T vRam;

    public BoxGeneric(T ghz, T vRam) {
        this.ghz = ghz;
        this.vRam = vRam;
    }

    public BoxGeneric(){

    }

    @Override
    public String toString() {
        return "BoxGeneric{" +
                "ghz=" + ghz +
                ", vRam=" + vRam +
                '}';
    }
}
