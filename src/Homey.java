public class Homey {

    String owner;
    int rooms;

    // Non-Parameterized Constructor
    Homey() {
        owner = "Default Owner";
        rooms = 2;
    }

    // Parameterized Constructor
    Homey(String owner, int rooms) {
        this.owner = owner;
        this.rooms = rooms;
    }

    void showDetails() {
        System.out.println("Owner: " + owner);
        System.out.println("Rooms: " + rooms);
        System.out.println();
    }

    public static void main(String[] args) {

        // Calls Non-Parameterized Constructor
        Homey h1 = new Homey();

        // Calls Parameterized Constructor
        Homey h2 = new Homey("Imran", 3);

        // Calls Parameterized Constructor
        Homey h3 = new Homey("Rahul", 5);

        h1.showDetails();
        h2.showDetails();
        h3.showDetails();
    }
}