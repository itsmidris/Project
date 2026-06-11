import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String > table = new Hashtable<>();
        table.put(101, "Imran");
        table.put(106, "Arman");
        table.put(103, "Irfan");
        table.put(105, "Farhan");

        System.out.println(table);

        System.out.println("\nDuplicate Key");
        table.put(101, "Prakash"); // Value get replaced with new one
        System.out.println(table);

        System.out.println("\nTraversal");

        for (Map.Entry<Integer, String> entry : table.entrySet()) {
            System.out.println(entry.getKey() +":"+ entry.getValue());
        };

        System.out.println(table.get(101));

        System.out.println(table.containsKey(105));

        System.out.println(table.containsValue("Irfan"));

        System.out.println(table.size());


    }
}
