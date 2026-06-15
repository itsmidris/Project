package GarageBillingSystem.Service;

import GarageBillingSystem.config.DBConfig;
import GarageBillingSystem.entity.Customer;
import GarageBillingSystem.entity.Invoice;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InvoiceService {

    public void addInvoice(Invoice invoice) throws SQLException {
        Connection conn = DBConfig.getConnection();

        PreparedStatement ps = conn.prepareStatement("insert into invoices (customer_id,vehicle_id,service_id) values (?,?,?)");

        ps.setInt(1, invoice.getCustomerId());
        ps.setInt(2, invoice.getVehicleId());
        ps.setInt(3, invoice.getServiceId());

        ps.executeUpdate();
        ps.close();

        conn.close();
    }

    public List<Invoice> getAllInvoices() throws SQLException {
        List<Invoice> list = new ArrayList<>();

        Connection conn = DBConfig.getConnection();

        Statement st = conn.createStatement();

        ResultSet rs = st.executeQuery("select * from invoices");

        while (rs.next()){
            list.add(new Invoice(rs.getInt("id"),
                    rs.getInt("customer_id"),
                    rs.getInt("vehicle_id"),
                    rs.getInt("service_id")));
        }
        return list;
    }
}
