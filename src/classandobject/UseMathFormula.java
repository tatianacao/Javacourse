package classandobject;

public class UseMathFormula {
    public static void main(String[] args) {

        //create object of test class
        //object: an instance of a class
        MathFormula use = new MathFormula();
        //call the addition method vvv
        //fyi add and surface are "void" & have print statement
        int add;
        use.add(10, 5);
        //System.out.println(use.add(10,5)); --> THIS RESULTED IN ERROR
        //it is non-return method
        //if it has print statement - it will print
        //if it does not have print statement - it will not print here
        use.surface(34, 45);
        //it is non-return method, but has print statement
        use.division(10,2);
        //this did not print
        //this is not printed, why?
        //this is return method
        //there is no print statement
        //vvv this will print because it is a print statement
        System.out.println(use.division(20,1));


        use.multiplication();
        //this multiplication did not print
        //this is return method
        //there is no print statement
        use.surface(50, 2);
        //it is non-return method, but has print statement
        //this is printed as 48, based on numbers inputted here
        int myTotal = use.division(90,3);
        //return type you an either print or assign as a value
        System.out.println(use.multiplication());
        //this ^^ is able to print because the method type is an integer and an integer is printable
        //multiplication is return method, no print statement on blueprint
        // but a print statement here can print
    }
}
//how do we access the methods in calculator from another class? objects
//a return method can be printed and assigned as a value

