package CursorInterfaces;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
    ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("python");
        list.add("C++");

        ListIterator<String> li = list.listIterator();

        // Forward
        System.out.println("Forward/-----");
        while(li.hasNext()) {
            String data = li.next();
            if(data.equals("python")) {
                li.set("Spring");
            }
        }

        System.out.println(list);

        System.out.println("Backward/----");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
