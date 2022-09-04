package datatypes.primitive;

public class Variables {
    public static void main(String[]args){

// data type: variableType variableName (declaration) = variableValue (assignment)
//PRIMITIVE VARIABLES
//numbers
    //whole numbers
    byte b = 4; //1 byte
        //the limitation for byte is -128 --> 127, anything above that will be more than 1 byte
    short s = 34; //2 bytes
    int x = 2344; //4 bytes
    long l = 656786L; //8 bytes

    // fractions - decimals
    float f = 1.34567F; //4 bytes
    double d = 1.45; //8 bytes
        //we put the F for float like we put the L for long

//characters
char c = '4'; //2 bytes

//true or false
boolean bool = false; //1 bit (1/8 byte)

//declare variable: variableType variableName;
int a;
//assign variable: variable Name = variableValue
    //in order to assign a variable it has to be previously declared
a = 1234;
a = 9876; //reassignment
// general variable naming
int _age = 20;
/*
EXAMPLE: _age
VARIABLE NAME:
* it can contain letters, digits, _ and $
* must begin with letter also accepts _ and $
* should start with lowercase
* no space allowed
* java keyboard cannot be used (like int, boolean, ...)
* use camel case (firstWordIsLowerAnyNewWordStartsWithCapital)
*/
//java logic
System.out.println(10>5);

//NON-PRIMITIVE VARIABLES
    //chain of character (words) - one character or more or nothing
    String str = "any text World or 1234 or special character";
        //str.replace("World", "new World");
        //manipulation
        //System.out.println(str.replace("World", "new World"));
        System.out.println(str.trim());
        //this allows for spaces to exist before and after the word
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf("World"));
        //index means - in what position does that letter start

    //array: a variable that can hold multiple values
    // ARRAY SYNTAX: variableType[] variableName = {value1, value2, value3}
    int[] array = {5, 2, 7};

//Value reassignment
int number = 60;
System.out.println(number);
number = 30;
System.out.println(number);
//object: is an instance of a class
// final variable can not be reassigned
// final int weight = 62;
// using final does not allow for weight to be reassigned
// string concatenation
        String firstName = "jack";
        String lastName = "sparrow";
        int year = 45;
        System.out.println(firstName+lastName);
        //what if we want to put a space between jack and sparrow?
        String space = "    ";
        System.out.println(firstName+space+lastName);
        //or
        System.out.println(firstName+" "+lastName);
        System.out.println(firstName+year);

}}
// vvvv also found in CLASS AND OBJECT/ introduction

/*
java is an object-oriented program (OOP)
java is all about classes and objects
JAVA SYNTAX: accessModifier methodType methodName () {body}
public static void main (String[] args) {body}
PRINT STATEMENT: System.out.println ("QUOTE");

CLASS:
java class is a blueprint/ architecture/ template that holds variables
you can use the variables by using the right "blueprint", or class.
class name should start with a capital
class is a block of code

OBJECT:
object is an instance of class
objects inherit all class properties
ClassName objectName = new ClassName

ClassName objectName = new ClassName

 */

