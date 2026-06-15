package GarageBillingSystem.Service;

import GarageBillingSystem.config.DBConfig;
import GarageBillingSystem.entity.InvoiceDetail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InvoiceDetailService {

    public void addInvoiceDetail(
            InvoiceDetail detail) throws SQLException {

        Connection conn = DBConfig.getConnection();

        PreparedStatement ps =
                conn.prepareStatement(
                        "INSERT INTO invoice_details(invoice_id,service_id) VALUES(?,?)");

        ps.setInt(1, detail.getInvoiceId());
        ps.setInt(2, detail.getServiceId());

        ps.executeUpdate();

        ps.close();
        conn.close();
    }
}