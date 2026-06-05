package OopsProject;

public class Car extends Vehicle{
    private int seats;

    public Car(int vehicleId, String brand, String model, double rentPerDay, int seats){
        super(vehicleId, brand, model, rentPerDay);

        this.seats=seats;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car : "+ getBrand()+ " "+ getModel()+ " | Seats : "+ seats+ " | Rent : "+ getRentPerDay());
    }

    /*@Override
    public void displayDetails(){
        System.out.println("Car : "+ getBrand()+ " "+ getModel()+ " | Seats : "+ seats+ " | Rent : "+ getRentPerDay());
    }*/

}
