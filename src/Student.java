public class Student {

    String name;
    int age;

    Student() {
        this("Unknown", 0);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void studentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        hello(this);
    }

    void hello(Student s) {
        System.out.println("Hello " + s.name);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Ayush", 12);

        s1.studentDetails();
        s2.studentDetails();
    }
}