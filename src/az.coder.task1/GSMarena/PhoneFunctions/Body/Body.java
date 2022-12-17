package az.coder.task1.GSMarena.PhoneFunctions.Body;

public class Body <T> implements BodyFunction<T>{
    T dimensions;
    T weight;
    T build;
    T sim;

    @Override
    public void waterProof() {

    }

    @Override
    public void paymentSystem() {

    }


    public Body(T dimensions, T weight, T build, T sim) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.build = build;
        this.sim = sim;
    }

    public Body() {
    }



    @Override
    public String toString() {
        return "\nBody\n " + "Dimensions: " + dimensions + ", Weight: " + weight + ", Build: " + build + ", SIM: " + sim;
    }



}
