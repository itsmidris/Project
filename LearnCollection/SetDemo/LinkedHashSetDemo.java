package SetDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Add elements
        set.add(10);
        set.add(20);
        set.add(10); // Duplicate
        set.add(40);
        set.add(60);
        set.add(null);

        System.out.println("LinkedHashSet: " + set);

        // Contains
        System.out.println("Contains 20? " + set.contains(20));

        // Remove
        set.remove(40);
        System.out.println("After removing 40: " + set);

        // Size
        System.out.println("Size: " + set.size());

        // Is Empty
        System.out.println("Is Empty? " + set.isEmpty());

        // Iterate
        System.out.println("Elements:");
        for(Integer num : set) {
            System.out.println(num);
        }

        // Clear
        set.clear();
        System.out.println("After clear(): " + set);
    }
}