import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Spring");
        stack.push("MySQL");

        System.out.println("Stack: " + stack);

        System.out.println("Top: " + stack.peek());

        System.out.println("Removed: " + stack.pop());

        System.out.println("After Pop: " + stack);

        System.out.println("Is Empty: " + stack.empty());

        System.out.println("Element at index 1: " + stack.get(1));

        System.out.println("Search Java: " + stack.search("Java"));
    }
}