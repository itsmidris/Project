import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Add
        map.put(82,"Imran");
        map.put(null,"Vandana"); //Null Key
        map.put(88,"Pooja");

        System.out.println("\nInitial Map");
        System.out.println(map);

        //Duplicate Key & Value
        map.put(82, "Pooja");
        System.out.println(map);

        //Null Value
        map.put(0,null);
        map.put(35,null);


        //Traversal
        System.out.println("\n Traversal");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key= " + entry.getKey() + " Value: " + entry.getValue());
        }
    }

}
