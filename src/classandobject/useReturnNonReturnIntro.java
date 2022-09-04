package classandobject;

public class useReturnNonReturnIntro {

    public static void main(String[] args) {

        //syntax: ClassName objectName = New ClassName();
        ReturnNonReturnIntro myObject = new ReturnNonReturnIntro();
        System.out.println(myObject.age);
        //by using the ClassName objectName = New ClassName syntax, we are accessing the other class name (another file)
        //and the properties under that class, "ClassName"
        int extraAge = 10;
        int totalAge = myObject.age+extraAge;
        System.out.println(myObject.age+extraAge);

//QUESTION: what is the difference between return and non-return method?

//non-return method cannot be assigned to a variable/ "void"
        myObject.myMethod();
        myObject.addition(98, 65);

//return method can be assigned to a variable
        int myAge = myObject.getMyAge();
        System.out.println(myAge);
        //the integer here is the variable being assigned

        ReturnNonReturnIntro mr = new ReturnNonReturnIntro();
        int myCurrentAge;

        myCurrentAge = mr.getAnyAge(1999, 2022);
        System.out.println(myCurrentAge);

    }
}


