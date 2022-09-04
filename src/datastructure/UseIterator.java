package datastructure;

import datatypes.nonprimitive.Array;

import java.util.ArrayList;
import java.util.Iterator;

public class UseIterator {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(0);
        list.add(2);
        list.add(1);
        list.add(9);

        Iterator it = list.iterator();
        System.out.println(it.next());
        //this will run the first value (4)
        System.out.println(it.next());
        //this will print "0"

        //this method will appropriately list the integers in the right order because you convrted it to iterator
        //^this means you converted a list to an iterator
        //& you can store it inside an iterator object
        while (it.hasNext()){
            System.out.println(it.next());
        }
//once it reaches 9, the loop will stop bc the condition is "while it.hasnext... print the next"

    }
}
//you can make a list, queu, and set an iterator

