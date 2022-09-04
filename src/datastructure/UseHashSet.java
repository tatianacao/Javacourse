package datastructure;

import java.util.HashSet;
import java.util.Set;

public class UseHashSet {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // bc this hashset is implementing hashset u can just use set
        set.add("john");
        set.add("jack");
        set.add("dave");
        set.add("brad");
        set.add("lila");
        set.add("eva");
        set.add("max");

        System.out.println(set);
        for (String name: set){
            System.out.println(name);
        }
        set.remove( "john");
        //john gets removed ^

        //we cannot work with indexes here, this is a SET
        //what is the difference between set and indexes?
        //SET: does not accept ....? duplicates?
        //Array Lists: keeps the given order
        //SET: gives a random order

        System.out.println(set);
        Set<Integer>mySet = new HashSet<>();
        mySet.add(4);
        mySet.add(3);
        mySet.add(4);
        mySet.add(1);
        mySet.add(8);
        System.out.println(set);
        System.out.println(mySet);
//^^this will print from the smallest to biggest number
//whenever you do numbers in set, it will give it in order
//when you do Strings, it will give you random order
//LINKED HASHTAG runs in the order you initially write it in

    }
}
/*
Basic	                HashSet 	        HashMap
Implements 	        Set interface 	        Map interface

Duplicates	            No 	                Yes duplicates values are allowed but no duplicate key is allowed

Dummy values 	        Yes 	                No

Objects required during
an add operation	    1	                    2

Adding and storing
mechanism 	        HashMap object 	        Hashing technique
Speed	                slower               It is comparatively faster than HashSet because of hashing technique has been used here.
Null 	        Have a single null value 	Single null key and any number of null values
Insertion Method	    Add()	                Put()
 */