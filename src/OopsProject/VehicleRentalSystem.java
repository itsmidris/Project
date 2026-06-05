package OopsProject;

import java.util.ArrayList;

public class VehicleRentalSystem {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    private ArrayList<Rental> rentals =new ArrayList<>();

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void showAvailableVehicles(){
        System.out.println("\nAvailable Vehicle");

        for (Vehicle vehicle:vehicles){
            if (vehicle.isAvailable()){
                vehicle.displayDetails();
            }
        }
    }

    public void rentVehicle(int vehicleId, Customer customer, int days){
        for (Vehicle vehicle: vehicles){
            if (vehicle.getVehicleId() == vehicleId && vehicle.isAvailable()){
                vehicle.setAvailable(false);

                Rental rental = new Rental(rentals.size()+1, customer, vehicle, days);

                rentals.add(rental);
                System.out.println("Vehicle Rented Successfully");
                rental.displayRental();

                return;
            }
        }


    }

    public void returnVehicle(int vehicleId){
        for (Vehicle vehicle: vehicles){
            if (vehicle.getVehicleId() == vehicleId){
                vehicle.setAvailable(true);
                System.out.println("Vehicle Returned Successfully!");

                return;
            }
        }

        System.out.println("Vehivle Not Found");
    }

    public void showRentals() {

        System.out.println(
                "\n===== RENTAL HISTORY ====="
        );

        for (Rental rental : rentals) {

            rental.displayRental();
        }
    }
}
