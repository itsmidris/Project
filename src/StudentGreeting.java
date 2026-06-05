public class StudentGreeting {

    //Pass current object to a method

    String name;

    StudentGreeting(String name) {
        this.name = name;
    }

    void show() {
        hello(this); //The current object that is calling this method
    }

    void hello(StudentGreeting s) {
        System.out.println("Hello " + s.name);
    }

    public static void main(String[] args) {
        StudentGreeting s = new StudentGreeting("Imran");
        s.show();
    }
}