package GarageBillingSystem.Service;

import GarageBillingSystem.config.DBConfig;
import GarageBillingSystem.entity.Customer;
import GarageBillingSystem.entity.Invoice;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InvoiceService {

    public int addInvoice(Invoice invoice)
            throws SQLException {

        Connection conn = DBConfig.getConnection();

        PreparedStatement ps =
                conn.prepareStatement(
                        "INSERT INTO invoices(customer_id,vehicle_id) VALUES(?,?)",
                        Statement.RETURN_GENERATED_KEYS);

        ps.setInt(1, invoice.getCustomerId());
        ps.setInt(2, invoice.getVehicleId());

        ps.executeUpdate();

        ResultSet rs = ps.getGeneratedKeys();

        if(rs.next()) {
            return rs.getInt(1);
        }

        return -1;
    }

    public List<Invoice> getAllInvoices() throws SQLException {
        List<Invoice> list = new ArrayList<>();

        Connection conn = DBConfig.getConnection();

        Statement st = conn.createStatement();

        ResultSet rs = st.executeQuery("select * from invoices");

        while (rs.next()){
            list.add(new Invoice(
                    rs.getInt("id"),
                    rs.getInt("customer_id"),
                    rs.getInt("vehicle_id")));
        }
        return list;
    }
}
