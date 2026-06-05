package OopsProject;

public class Rental {
    private   int rentalId;
    private Customer customer;
    private Vehicle vehicle;
    private int days;

    public Rental(int rentalId, Customer customer, Vehicle vehicle, int days){
        this.rentalId=rentalId;
        this.customer  = customer;
        this.vehicle=vehicle;
        this.days=days;
    }

    public double calculateBill(){
        return vehicle.getRentPerDay() * days;
    }

    public void displayRental(){
        System.out.println("\n===== RENTAL DETAILS =====");

        System.out.println("Rental ID : " + rentalId);
        System.out.println("Customer  : " + customer.getName());
        System.out.println("Vehicle   : "
                + vehicle.getBrand()
                + " "
                + vehicle.getModel());

        System.out.println("Days      : " + days);

        System.out.println("Total Bill: ₹" + calculateBill());
    }

}
