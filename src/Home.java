//Non-parameterized constructor
public class Home {
    String owner;
    int rooms;

    //Non-parameterized constructor
    Home(){
        owner = "Imran";
        rooms = 3;
        System.out.println("Constructor Called");
    }

    /* Using This
    Home() {
        this.owner = "Imran";
        this.rooms = 3;

        System.out.println("Home constructor called");
    }*/

    void showDetails() {
        System.out.println("Owner: "+owner);
        System.out.println("Rooms: "+ rooms);
    }

    public static void main() {
        System.out.println("Before object creation");

        Home h = new Home();

        System.out.println("After object creation");

        h.showDetails();
    }
}

