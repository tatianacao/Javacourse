package oops.encapsulation;

import oops.encapsulation.GetNSet;

public class GetNSetTest {
    public static void main(String[] args) {
        GetNSet Object = new GetNSet ();
        Object.setName("Sally");
        Object.setfavColor("Purple");
        Object.setAge(9);
        System.out.println(Object.getAge());
        //you have to GET the value
        //you can not grab anything from a class

        System.out.println("Hi my name is "+Object.getName());
        System.out.println("I am "+Object.getAge());
        System.out.println("My favorite color is " + Object.getfavcolor());


    }}