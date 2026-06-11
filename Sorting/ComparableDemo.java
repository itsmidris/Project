import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparableDemo {

    public static void main(String[] args) {
        ArrayList<Integer> AL = new ArrayList<>();
        AL.add(99);
        AL.add(1);
        AL.add(2);
        AL.add(5);

        System.out.println(AL);

        Collections.sort(AL);

        System.out.println(AL);

        Collections.shuffle(AL);

        System.out.println(AL);

        Collections.reverse(AL);

        System.out.println(AL);
    }
}
