package oops.abstraction;

public abstract class ModernCar {
    //abstract methods /just add the abstract keyword bc this is a hybrid
    //if it were just interface then you don't need to
    // add "abstract" for it to be a hybrid
    //why don't I have a print statement for hydraulic brake?
    public abstract void hydraulicBrake();
    //you need to implement this class as "extends"

    //non-abstract methods
    public void navigationSystem(){
        System.out.println("powered by garmin");
    }
}
//hybrid interface class
//it means you can create both abstract and non-abstract methods
//ABSTRACT KEYWORD: abstract makes a class hybrid interface/class


//REFER TO KEYWORDS PACKAGE FOR A CLASS ON ABSTRACT
