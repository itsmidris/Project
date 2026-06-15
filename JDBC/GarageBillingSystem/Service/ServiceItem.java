package GarageBillingSystem.entity;

public class ServiceItem {

    private int id;
    private String description;
    private double cost;

    public ServiceItem() {
    }

    public ServiceItem(int id, String description, double cost) {
        this.id = id;
        this.description = description;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return id + " | " + description + " | ₹" + cost;
    }
}