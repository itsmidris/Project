package SetDemo;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        // Adding elements
        set.add(50);
        set.add(20);
        set.add(70);
        set.add(10);
        set.add(40);
        set.add(20); // Duplicate
        // set.add(null); // Throws NullPointerException

        System.out.println("TreeSet: " + set);

        // First and Last element
        System.out.println("First Element: " + set.first());
        System.out.println("Last Element: " + set.last());

        // Lower and Higher
        System.out.println("Lower than 40: " + set.lower(40));
        System.out.println("Higher than 40: " + set.higher(40));

        // Floor and Ceiling
        System.out.println("Floor of 35: " + set.floor(35)); // Less than Equal to 35
        System.out.println("Ceiling of 35: " + set.ceiling(35)); // Higher that Equal to 35

        // Remove element
        set.remove(20);
        System.out.println("After removing 20: " + set);

        // Check element
        System.out.println("Contains 50? " + set.contains(50));

        // Size
        System.out.println("Size: " + set.size());

    }
}