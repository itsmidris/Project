import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        map.put(101,"Imran");
        map.put(104,"Raj");
        map.put(102,"Aditya");
        map.put(103,"Imran");

        System.out.println(map);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getValue() + "-->" + entry.getKey());
        }

        System.out.println(map.get(101));

        System.out.println(map.containsKey(102));

        System.out.println(map.containsValue("Imran"));

        System.out.println(map.size());
    }
}
