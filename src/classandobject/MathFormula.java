package classandobject;

public class MathFormula {
    //non-return method --> MUST HAVE PRINT STATEMENT IN BLUEPRINT OR IT WILL NOT PRINT BC VOID
    //method: is a block of code, reusable code only works when called
    //generic method of writing vvv
    /*
    void addition (){
    int num1 = 10;
    int num2 = 5;
    int total = num1 + num2;
    System.out.println(total);
     */
    //OR vvv
    public void add(int a, int b){
        int total = a+b;
        //System.out.println(total);
        //erasing the print statement will not allow it to print because
        //it is a VOID statement
        //we are unable to call it...? on the

    }
    public void surface(int width, int height){
        int surface = width * height;
        System.out.println(surface);
        //void in the beginning means NO TYPE, the value is NOTHING
        //you need to add the value of that specific method
    }

    //RETURN METHOD --> CAN BE CALLED UPON IN TEST CLASS
    public static int multiplication (){
        int num1 = 10;
        int num2 = 5;
        int total = num1 * num2;
        return total;
        //we set the type of method and we set the value of the method
        //you need to mention the value when you add the return keyword
        //this is an integer method
    }
    public static int division (int num1, int num2){
        int total = num1/ num2;
        return total;
    }
}