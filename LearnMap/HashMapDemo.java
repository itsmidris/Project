import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // 1. Adding elements
        map.put(101, "Imran");
        map.put(102, "Raj");
        map.put(103, "Aditya");

        System.out.println("Initial Map : " + map);

        // 2. Duplicate Key
        map.put(101, "Prakash");

        System.out.println("\nDuplicate Key Replaces Value");
        System.out.println(map);

        // 3. Duplicate Values Allowed
        map.put(104, "Raj");

        System.out.println("\nDuplicate Values Allowed");
        System.out.println(map);

        // 4. Null Key Allowed (Only One)
        map.put(null, "Null Key Data");

        System.out.println("\nOne Null Key Allowed");
        System.out.println(map);

        // 5. Multiple Null Values Allowed
        map.put(105, null);
        map.put(106, null);

        System.out.println("\nMultiple Null Values Allowed");
        System.out.println(map);

        // 6. get()
        System.out.println("\nGet Value of Key 102");
        System.out.println(map.get(102));

        // 7. containsKey()
        System.out.println("\nContains Key 103 ?");
        System.out.println(map.containsKey(103));

        // 8. containsValue()
        System.out.println("\nContains Value Raj ?");
        System.out.println(map.containsValue("Raj"));

        // 9. size()
        System.out.println("\nSize of Map");
        System.out.println(map.size());

        // 10. remove()
        map.remove(104);

        System.out.println("\nAfter Removing Key 104");
        System.out.println(map);

        // 11. keySet()
        System.out.println("\nAll Keys");
        System.out.println(map.keySet());

        // 12. values()
        System.out.println("\nAll Values");
        System.out.println(map.values());

        // 13. entrySet()
        System.out.println("\nKey-Value Pairs");
        System.out.println(map.entrySet());

        // 14. Traversing Map
        System.out.println("\nTraversing Map using entrySet() ");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {

            System.out.println(
                    "Key = " + entry.getKey() +
                            " Value = " + entry.getValue()
            );
        }

        System.out.println("\nTraversing Map using keySet() ");
        for(Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        System.out.println("\nTraversing Map using map.values()");
        int i =1;
        for (String value : map.values()){
            System.out.println("Value " + i + ": " + value);
            i++;
        }

        System.out.println("\nTraversing Map using Lambda Expression");
        map.forEach((key, value)->{
            System.out.println("Key = " + key + ", Value = " + value);
        });

        // 15. isEmpty()
        System.out.println("\nIs Empty ?");
        System.out.println(map.isEmpty());

        // 16. clear()
        map.clear();

        System.out.println("\nAfter Clear");
        System.out.println(map);

        System.out.println("\nIs Empty ?");
        System.out.println(map.isEmpty());
    }
} 