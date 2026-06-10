package SetDemo;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // Add elements
        set.add(10);
        set.add(20);
        set.add(10); // Duplicate
        set.add(40);
        set.add(60);
        set.add(null);

        System.out.println("HashSet: " + set);

        // Contains
        System.out.println("Contains 20? " + set.contains(20));

        // Remove
        set.remove(40);
        System.out.println("After removing 40: " + set);

        // Size
        System.out.println("Size: " + set.size());

        // Is Empty
        System.out.println("Is Empty? " + set.isEmpty());

        // Traversal
        System.out.println("Elements:");
        for(Integer num : set) {
            System.out.println(num);
        }

        // Clear
        set.clear();

        System.out.println("After clear(): " + set);
    }
}