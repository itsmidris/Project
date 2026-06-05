package OopsProject;

public class Main {

    public static void main(String[] args) {

        // Create system
        VehicleRentalSystem system = new VehicleRentalSystem();

        // Add vehicles
        system.addVehicle(
                new Car(
                        1,
                        "Hyundai",
                        "Creta",
                        2000,
                        5
                )
        );

        system.addVehicle(
                new Bike(
                        2,
                        "Yamaha",
                        "R15",
                        700,
                        155
                )
        );

        system.addVehicle(
                new Truck(
                        3,
                        "Tata",
                        "LPT",
                        5000,
                        5
                )
        );

        // Create customer
        Customer customer =
                new Customer(
                        101,
                        "Imran",
                        "9876543210"
                );

        // Show available vehicles
        system.showAvailableVehicles();

        // Rent Vehicle ID 1 for 3 days
        system.rentVehicle(
                1,
                customer,
                3
        );

        // Show available vehicles again
        system.showAvailableVehicles();

        // Return vehicle
        system.returnVehicle(1);

        // Show available vehicles again
        system.showAvailableVehicles();

        // Show rental history
        system.showRentals();
    }
}