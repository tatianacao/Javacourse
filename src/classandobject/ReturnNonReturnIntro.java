package classandobject;

public class ReturnNonReturnIntro {

    /* java is an object-oriented program (OOP)
    java is all about classes and objects
    java class is a blueprint or template for object
     */
    //class properties (variables or methods)
    public String name = "John Doe";
    public int age = 20;
    String gender = "M";

    //method or function is a reusable block of code that runs only when it is called


//NON-RETURN method without parameters
    //syntax: accessModifier methodType methodName () {body}
    public void myMethod(){
        System.out.println("my first method print few lines");
        System.out.println("this is my second line");
        System.out.println("third and final line to print");
    }
//NON-RETURN method with parameters
    public void addition(int a, int b){
        int total = a+ b;
        System.out.println(total);
    }
//RETURN METHOD without parameters
    //syntax: accessModifier returnDataType methodName () {body return valueToReturn}
    public int getMyAge(){
        int yearBorn = 1990;
        int currentYear = 2022;
        int myAge = currentYear - yearBorn;
        return myAge;
        //you already give the value here
    }
    //return method with parameters
    public int getAnyAge(int yearofBorn, int currentYear) {
        int myAge = currentYear - yearofBorn;
        return myAge;

    }

}
