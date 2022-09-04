package oops.abstraction;

public class Honda implements Car, Motor {

    //car interface methods
    public void start() {
        System.out.println("keyless car");
    }

    public void brake() {
        System.out.println("brake");
    }

    //motor interface methods
    public void engine() {

    }

    public void fuelType() {

    }
}
