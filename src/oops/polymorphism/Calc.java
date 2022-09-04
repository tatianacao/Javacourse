package oops.polymorphism;

public class Calc {
    //polymorphism is about method
    //TWO TYPES

    //overloading: use the same method name with different parameters
    public int add (int a, int b){
        int total = a+ b;
        return total;
    }
    public int add(int a, int b, int c){
        int total = a+b+c;
        return total;
    //creating two methods with the same name, "ADD"
    //will give an error, but we can change parameters
    }
    public int sub (int a, int b){
        int total = a-b;
        return total;
    }
    //overriding: use the same method name with same parameters
    //but different body
        //can not override in the same class
    //vvvv the method below, for example, is an attempt to
        //have a different body, but it is not allowed in this class
        //because there already is a method named sub with a body we cannot change
    /*public int sub (int a, int b){
        int total = a-b + 5; ----> this +5 is different from the last sub's body
        return total;
     */
    //HENCE, we need to create a new class --> New Calc
    }

