package oops.polymorphism;

public class NewCalc extends Calc{
   @Override
    public int sub(int a, int b){
        int total = a-b +15;
        return total;
        //clicking the circle with red arrow will take you the method sub in Calc
        //after using inheritance and override,
        //you can change the body while keeping same method name and same parameters

    }
}
