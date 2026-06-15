package GarageBillingSystem.Service;

import GarageBillingSystem.entity.Invoice;
import GarageBillingSystem.Service.VehicleService;
import GarageBillingSystem.entity.InvoiceDetail;
import GarageBillingSystem.entity.ServiceItem;

import java.sql.SQLException;
import java.util.List;

public class BillingService {
    public CustomerService customerService = new CustomerService();

    public InvoiceService invoiceService = new InvoiceService();

    public VehicleService vehicleService = new VehicleService();

    public InvoiceDetailService invoiceDetailService = new InvoiceDetailService();

    public ServiceItemService serviceItemService = new ServiceItemService();


    public void CreateInvoice(
            int customerId,
            int vehicleId,
            List<Integer> serviceIds)
            throws SQLException {

        int invoiceId =
                invoiceService.addInvoice(
                        new Invoice(
                                0,
                                customerId,
                                vehicleId));

        double total = 0;

        System.out.println("\n========== BILL ==========");

        for(Integer sid : serviceIds) {

            invoiceDetailService.addInvoiceDetail(
                    new InvoiceDetail(
                            0,
                            invoiceId,
                            sid));

            ServiceItem service =
                    serviceItemService.getServiceById(sid);

            System.out.println(
                    service.getDescription()
                            + " : ₹"
                            + service.getCost());

            total += service.getCost();
        }

        System.out.println("--------------------------");
        System.out.println("TOTAL = ₹" + total);
        System.out.println("==========================");
    }

    public void showAllInvoices() throws SQLException {
        List<Invoice> invoices = invoiceService.getAllInvoices();
        for (Invoice invoice:invoices){
            System.out.println(invoice);
        }
    }
}
