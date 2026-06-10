package CursorInterfaces;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        Iterator<String> itr = list.iterator();

        while(itr.hasNext()){
            String data = itr.next();

            if (data.equals("Python")){
                itr.remove();
            }
        }

        System.out.println(list);

    }

}
