package datastructure;

import java.util.ArrayList;

public class UseArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(0);
        list.add(2);
        list.add(1);
        list.add(9);

        System.out.println(list.get(0));
        //how can we have access to all the values at the same time?
        for (int i = 0; i<5; i++){
            System.out.println(list.get(i));
        }
        list.remove(4);
        System.out.println(list);
        list.add(3, 20);
        System.out.println(list); //this will insert the value 20 in the third position

        list.set(1,50);
        System.out.println(list); //this will insert/replace the first value
        //hard coding: putting i<5 bc the 6 will not print out
        //soft coding: you can put list.size(); i++ and it would print all numbers
        ArrayList<Object> myList = new ArrayList <Object>();
        myList.add(4);
        myList.add("john");
        myList.add(true);
        myList.add('&');
        myList.add(1.5);

        //we can not mix values in an array, so how can we do this?
        //we add the <Object> bc all classes are under this
        //now an array does not have to be bounded and we can have multiple values


    }
}
//java is all about objects and classes

