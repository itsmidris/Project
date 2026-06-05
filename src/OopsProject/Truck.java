package OopsProject;

public class Truck extends Vehicle{
    private double loadCapacity;

    public Truck(int vehicleId, String brand, String model, double rentPerDay, double loadCapacity){
        super(vehicleId, brand, model, rentPerDay);

        this.loadCapacity=loadCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck : "+ getBrand()+ " "+ getModel()+ " | Capacity : "+ loadCapacity+ "Ton" +"| Rent : "+ getRentPerDay());
    }
}
