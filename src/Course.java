public class Course {
    String name;
    int duration;

    Course(){
        System.out.println("Constructor Called");
    }

    static void main() {
        System.out.println("Before object create");
        Course c = new Course();
        System.out.println("After object create");
        c.learn();
    }

    void learn(){
        System.out.println("We are learning " + name);
    }

}
