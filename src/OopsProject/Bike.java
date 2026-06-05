package OopsProject;

public class Bike extends Vehicle{
    private int engineCC;

    public Bike(int vehicleId, String brand, String model, double rentPerDay, int engineCC){
        super(vehicleId, brand, model, rentPerDay);

        this.engineCC=engineCC;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike : "+ getBrand()+ " "+ getModel()+ " | Engine : "+ engineCC+ "CC" + " | Rent : "+ getRentPerDay());
    }
}
