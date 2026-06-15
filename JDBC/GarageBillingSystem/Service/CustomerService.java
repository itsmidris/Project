package GarageBillingSystem.Service;

import GarageBillingSystem.config.DBConfig;
import GarageBillingSystem.entity.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    public void addCustomer(Customer customer) throws SQLException {
        Connection conn = DBConfig.getConnection();

        PreparedStatement ps = conn.prepareStatement("insert into customers (name,phone) values (?,?)");

        ps.setString(1, customer.getName());
        ps.setString(2, customer.getPhone());

        ps.executeUpdate();

        ps.close();

        conn.close();

    }

    public List<Customer> getAllCustomers() throws SQLException {
        List<Customer> list = new ArrayList<>();

        Connection conn = DBConfig.getConnection();

        Statement st = conn.createStatement();

        ResultSet rs = st.executeQuery("select * from customers");

        while (rs.next()){
            list.add(new Customer(rs.getInt("id"), rs.getString("name"),rs.getString("phone")));

        }
        return list;
    }

    public Customer getCustomersBasedOnNum(String number)
            throws SQLException {

        Customer customer = null;

        Connection conn = DBConfig.getConnection();

        PreparedStatement ps =
                conn.prepareStatement(
                        "SELECT * FROM customers WHERE phone = ?");

        ps.setString(1, number);

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {
            customer = new Customer(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("phone"));
        }

        return customer;
    }
}
