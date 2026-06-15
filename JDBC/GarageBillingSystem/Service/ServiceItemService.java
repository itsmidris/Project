package GarageBillingSystem.Service;

import GarageBillingSystem.config.DBConfig;
import GarageBillingSystem.entity.ServiceItem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceItemService {

    public List<ServiceItem> getAllServices() throws SQLException {

        List<ServiceItem> list = new ArrayList<>();

        Connection conn = DBConfig.getConnection();

        Statement st = conn.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM services");

        while(rs.next()) {

            list.add(new ServiceItem(
                    rs.getInt("id"),
                    rs.getString("description"),
                    rs.getDouble("cost")
            ));
        }

        return list;
    }

    public ServiceItem getServiceById(int id) throws SQLException {

        ServiceItem service = null;

        Connection conn = DBConfig.getConnection();

        PreparedStatement ps =
                conn.prepareStatement(
                        "SELECT * FROM services WHERE id=?");

        ps.setInt(1,id);

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {

            service = new ServiceItem(
                    rs.getInt("id"),
                    rs.getString("description"),
                    rs.getDouble("cost")
            );
        }

        return service;
    }
}