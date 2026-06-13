package JDBCP01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ForwardDirOnly {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Loading Driver Class

            Connection con = DriverManager.getConnection(
                    "JDBC:mysql://localhost:3306/mystd", "root", "1234");
            Statement statement= con.createStatement();
            String query="select * from student";


            ResultSet rs = statement.executeQuery(query);

            System.out.println("---Data---");

            while (rs.next()){
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("stdName") + " | " +
                                rs.getInt("age")
                );
            }

        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Exception");
        }
    }
}
