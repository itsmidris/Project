import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{

    int id;

    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main() {
        ArrayList<Student> students = new ArrayList<>();

        Student s1 = new Student(82, "Imran");
        Student s2 = new Student(90, "Jyoti");
        Student s3 = new Student(88, "Pooja");

        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println(students);

        Collections.sort(students);

        System.out.println(students);

    }
}
