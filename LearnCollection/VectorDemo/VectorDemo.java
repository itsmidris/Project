package VectorDemo;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        // Add
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(20);

        System.out.println("Vector : " + vector);

        // Get
        System.out.println("Element at index 1 : "
                + vector.get(1));

        // Update
        vector.set(1, 99);
        System.out.println("After Update : " + vector);

        // Remove
        vector.remove(2);
        System.out.println("After Remove : " + vector);

        // Contains
        System.out.println("Contains 99 ? "
                + vector.contains(99));

        // Size
        System.out.println("Size : " + vector.size());

        // Loop
        System.out.println("Elements:");
        for (Integer num: vector){
            System.out.println(num);
        }
    }
}
