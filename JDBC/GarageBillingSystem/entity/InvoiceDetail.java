package GarageBillingSystem.entity;

public class InvoiceDetail {

    private int id;
    private int invoiceId;
    private int serviceId;

    public InvoiceDetail() {
    }

    public InvoiceDetail(int id, int invoiceId, int serviceId) {
        this.id = id;
        this.invoiceId = invoiceId;
        this.serviceId = serviceId;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public int getServiceId() {
        return serviceId;
    }
}
