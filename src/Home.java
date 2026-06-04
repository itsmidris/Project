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

