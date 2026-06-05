public class StudentDefaultData {
//    this() for Constructor Chaining
//    Call another constructor of the same class
    String name;
    int age;

    StudentDefaultData() {
        this("Unknown", 0); //call another constructor of the same class
    }

    StudentDefaultData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        StudentDefaultData s = new StudentDefaultData();
        s.show();
    }
}