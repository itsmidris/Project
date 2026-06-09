import java.util.ArrayList;
import java.util.List;

public class CustomList {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(101, "Imran"));
        studentList.add(new Student(102, "Rahul"));
        studentList.add(new Student(103, "Imran"));

        for (Student s: studentList){
            s.display();
        }
    }

    static class Student{
        int id;
        String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        void display(){
            System.out.println("id: "+id+ " name: " +name);
        }
    }
}
