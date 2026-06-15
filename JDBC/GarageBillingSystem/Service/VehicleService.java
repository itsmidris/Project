package GarageBillingSystem.Service;

import GarageBillingSystem.config.DBConfig;
import GarageBillingSystem.entity.Vehicle;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VehicleService {

    public void addVehicle(Vehicle vehicle) throws SQLException {

        Connection conn = DBConfig.getConnection();

        PreparedStatement ps =
                conn.prepareStatement(
                        "INSERT INTO vehicles(customer_id,number_plate,model) VALUES(?,?,?)");

        ps.setInt(1, vehicle.getCustomerId());
        ps.setString(2, vehicle.getNumberPlate());
        ps.setString(3, vehicle.getModel());

        ps.executeUpdate();

        ps.close();
        conn.close();
    }

    public List<Vehicle> getAllVehicles() throws SQLException {

        List<Vehicle> list = new ArrayList<>();

        Connection conn = DBConfig.getConnection();

        Statement st = conn.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM vehicles");

        while(rs.next()) {

            list.add(new Vehicle(
                    rs.getInt("id"),
                    rs.getInt("customer_id"),
                    rs.getString("number_plate"),
                    rs.getString("model")
            ));
        }

        return list;
    }

    public Vehicle getVehicleById(int id) throws SQLException {

        Vehicle vehicle = null;

        Connection conn = DBConfig.getConnection();

        PreparedStatement ps =
                conn.prepareStatement(
                        "SELECT * FROM vehicles WHERE id=?");

        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {

            vehicle = new Vehicle(
                    rs.getInt("id"),
                    rs.getInt("customer_id"),
                    rs.getString("number_plate"),
                    rs.getString("model")
            );
        }

        return vehicle;
    }
}