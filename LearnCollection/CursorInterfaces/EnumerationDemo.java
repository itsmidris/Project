package CursorInterfaces;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main() {
        Vector<String> v = new Vector<>();

        v.add("Java");
        v.add("Python");
        v.add("C++");

        Enumeration<String> e = v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
