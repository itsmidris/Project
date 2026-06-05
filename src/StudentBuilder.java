public class StudentBuilder {

    // Instance variables
    String name;
    int age;

    // Set name and return the current object
    StudentBuilder setName(String name) {
        this.name = name;      // Store value in current object's name
        return this;           // Return current object
    }

    // Set age and return the current object
    StudentBuilder setAge(int age) {
        this.age = age;        // Store value in current object's age
        return this;           // Return current object
    }

    // Display object data
    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        /*
         * Method Chaining
         *
         * new StudentBuilder()  -> Creates object
         * .setName("Imran")     -> Sets name and returns same object
         * .setAge(22)           -> Sets age and returns same object
         *
         * Because both methods return 'this',
         * we can call multiple methods in one statement.
         */

        StudentBuilder s = new StudentBuilder()
                .setName("Imran")
                .setAge(22);

        // Display details
        s.show();
    }
}