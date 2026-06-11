import javax.xml.transform.Source;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(82,"Imran");
        map.put(80,"Vandana"); //
        // map.put(null,"Vandana"); //Null Key not allowed
        map.put(88,"Pooja");

        System.out.println(map);

        map.put(35, null); // Null value allowed
        System.out.println(map);
        map.put(82, "Pooja");

        //Traversal

        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }



        //Special Treemap methods

        System.out.println("First Key: " + map.firstEntry()); //Provides Smallest Key

        System.out.println("Last Key: " + map.lastEntry()); //Provides Largest Key

        System.out.println("Current Key or Nearest smaller Key of 85: " + map.floorKey(85));

        System.out.println("Current Key or Nearest greater Key of 85: " + map.ceilingKey(85));

        System.out.println("Strictly smaller key: " + map.lowerKey(85));

        System.out.println("Strictly greater key: " + map.higherKey(85));

    }
}
