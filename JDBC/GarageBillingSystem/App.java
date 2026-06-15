package GarageBillingSystem;

import GarageBillingSystem.Service.BillingService;
import GarageBillingSystem.entity.Customer;
import GarageBillingSystem.entity.Vehicle;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        BillingService service = new BillingService();

        while (true){
            System.out.println("1. Add Customer with Vehicle \n2. Generate Invoice \n3. Show Invoice \n4. Exit");
            int ch = sc.nextInt();

            switch (ch){
                case 1:
                    System.out.print("Customer Name: ");
                    String name = sc.next();

                    System.out.print("Phone: ");
                    String phone = sc.next();

                    service.customerService.addCustomer(
                            new Customer(0, name, phone));

                    System.out.print("Enter Vehicle Number: ");
                    String vehicleNum = sc.next();

                    System.out.print("Enter Vehicle Model: ");
                    String model = sc.next();

                    Customer customer =
                            service.customerService.getCustomersBasedOnNum(phone);

                    service.vehicleService.addVehicle(
                            new Vehicle(
                                    0,
                                    customer.getId(),
                                    vehicleNum,
                                    model
                            ));

                    System.out.println("Customer and Vehicle Added Successfully");
                    break;
                case 2:
                    System.out.println("Enter Customer Id: ");
                    int cid= sc.nextInt();
                    System.out.println("Enter Vehicle Id: ");
                    int vid = sc.nextInt();
                    System.out.println("\nAvailable Services:");
                    for(var s : service.serviceItemService.getAllServices()) {
                        System.out.println(s);
                    }
                    int n = sc.nextInt();
                    List<Integer> sids= new ArrayList<>();

                    for (int i=0; i<n; i++){
                        System.out.println("Enter the Service Id: ");
                        sids.add(sc.nextInt());
                    }
                    service.CreateInvoice(cid,vid,sids);
                    break;
                case 3:
                    service.showAllInvoices();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Not a valid Choice: ");
                    break;
            }
        }
    }
}
