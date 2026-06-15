package GarageBillingSystem.Service;

import GarageBillingSystem.entity.Invoice;

import java.sql.SQLException;
import java.util.List;

public class BillingService {
    public CustomerService customerService = new CustomerService();

    public InvoiceService invoiceService = new InvoiceService();

    public void CreateInvoice(int customerId, int vehicleId, List<Integer> serviceIds) throws SQLException {

        String sids="";
        for (int serviceId: serviceIds){
            sids += serviceId;
        }
        invoiceService.addInvoice(new Invoice(0,customerId,vehicleId,Integer.parseInt(sids)));
        System.out.println("Invoice Generated Successfully...");


    }

    public void showAllInvoices() throws SQLException {
        List<Invoice> invoices = invoiceService.getAllInvoices();
        for (Invoice invoice:invoices){
            System.out.println(invoice);
        }
    }
}
