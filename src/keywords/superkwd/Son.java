package keywords.superkwd;

public class Son extends Father{
    //super class applies for inheritance
    //super keyword refers to super class
    //use it when you want to make a reference
    //can refer to super class constructor, method or variable
    public Son (){
        super (10);
    } //constructor


    public void higherEducation(){
        super.education();// method

        super.height = 10; //variable
    }
}
//single inheritance: class inherits from another class
//multi level inheritance: class inherited from another class
//hierarchical inheritance: multiple classes inherit from the same class
//bird extends to animal and animal can communicate
//grandfather extends to animal and grandfather can also communicate
/*multiple inheritance is not allowed in java: class inherits from multiple classes
example: Son can not inherit from Father or Mother*/


// public class Son extends Father {
//son is subclass
//father class is superclass
//to inherit from a class to another "extends "
//son --> father: single inheritance (between 2 class)
//}