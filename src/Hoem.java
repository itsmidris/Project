public class Hoem {

    String owner;
    int rooms;

    // Parameterized Constructor
    Hoem(String owner, int rooms) {
        this.owner = owner;
        this.rooms = rooms;
    }

    void showDetails() {
        System.out.println("Owner: " + owner);
        System.out.println("Rooms: " + rooms);
    }

    public static void main(String[] args) {

        Hoem h1 = new Hoem("Imran", 3);
        Hoem h2 = new Hoem("Rahul", 5);

        h1.showDetails();
        h2.showDetails();
    }
}