package oops.abstraction;

public class TestCar {
    public static void main(String[] args) {
        //object is an instance of a class
        //syntax: ClassName objectName = new ClassName();
        Toyota corolla = new Toyota();
        corolla.start();
        corolla.brake();
        corolla.autoRadio();
        corolla.engine();
        corolla.fuelType();
        //now in toyota you can call engine and fuel type bc toyota implemented Motor
        //Motor interface has engine and fuelType

        //WE CAN NOT CREATE AN OBJECT OF AN INTERFACE OR AN ABSTRACT CLASS
        //CAR newCar = new Car ---> not allowed
        //ModernCar Silly = new ModernCar ---> not allowed

        Honda civic = new Honda();
        civic.brake();
        civic.start();
        //another way to create an object:

        //syntax: InterfaceName objectName = new ClassName
        //another way to call the object
        Car camry = new Toyota();
        //call the interface (Car)
        //we can do this because Toyota is implementing Car
        //ClassName is implementing Interface
        camry.start();
        camry.brake();
        //you only have access to autoRadio, you only have access to start and brake
        //why? because Car only has start and brake
        //yes, even though Toyota has autoRadio

        Motor sienna = new Toyota();
        sienna.engine();
        sienna.fuelType();
        //only have access to fuelType and engine because it is based on the motor interface

    }
}
