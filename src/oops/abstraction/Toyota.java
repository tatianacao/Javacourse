package oops.abstraction;

public class Toyota extends ModernCar implements Car, Motor {
    //java doesn't support multiple inheritance (so you can only extend to one)
    public void start() {
        System.out.println("start car");}

    //car interface methods
    public void brake() {
        System.out.println("brake to stop");}
    public void autoRadio(){
            System.out.println("music music music");}

    //motor interface method
    public void engine() {
        System.out.println("with turbo vroom vroom");}
    public void fuelType() {
        System.out.println("diesel fuel");}

    //modern abstract class method
    public void hydraulicBrake() {}
//the autoRadio is not inside Car interface, we can call it in TEST CAR
    }
    //in order to implement the CAR interface, use the word IMPLEMENT
    //instead of extends as for inheritance, use implement
    //you have to implement methods (not override them)
    //once you implement more than one class (Class, Motor) --> you have to click implement methods (not override)
    //you can extend to a hybrid and obtain abstract methods

