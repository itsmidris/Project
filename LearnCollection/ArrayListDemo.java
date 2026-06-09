import java.util.ArrayList;

//Dynamic Size	✅ Yes
//Preserves Insertion Order	✅ Yes
//Allows Duplicates	✅ Yes
//Random Access	✅ Fast
//Stores Objects	✅ Yes
//Thread Safe	❌ No
//Null Values Allowed	✅ Yes

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Spring");
        courses.add("MySQL");
        courses.add("Java");

        System.out.println("List : " + courses);

        System.out.println("First Element : " + courses.get(0));

        System.out.println("Size : " + courses.size());

        System.out.println("Contains Java : "
                + courses.contains("Java"));

        courses.set(1, "Spring Boot");

        System.out.println(courses);

        courses.remove("MySQL");

        System.out.println(courses);
    }
}