package LinkedListDemo;

import javax.lang.model.element.Element;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<>();
        li.add("Raj");
        li.add("Imran");
        li.add("Aditya");
        li.add("Prakash");


        System.out.println("First element: " + li.getFirst());
        System.out.println("Last element: " + li.getLast());

        System.out.println("Element at index 2 "+ li.get(2));
        // traverses the linked list node by node until it reaches the required position.
        // conceptually it is traversing in a loop.

        int idx = 0;


        for ( String ele : li){

            System.out.println("Element at index "+ idx + ":" + ele);

            idx++;
        }
    }
}
