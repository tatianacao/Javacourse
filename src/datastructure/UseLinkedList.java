package datastructure;

import java.util.LinkedList;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(0);
        list.add(2);
        list.add(1);
        list.add(9);

        System.out.println(list);
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        list.remove(5);
        System.out.println(list);
        list.add(1,50);
        System.out.println(list);

    }
}
/*
in linked list we have nodes, and the head and tail
 */

