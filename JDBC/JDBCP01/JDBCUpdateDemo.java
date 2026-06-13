package JDBCP01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCUpdateDemo {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Loading Driver Class

            Connection con = DriverManager.getConnection(
                    "JDBC:mysql://localhost:3306/mystd", "root", "1234");
            Statement statement= con.createStatement();
            String query="UPDATE student set age = 22 where id=1";

            int update = statement.executeUpdate(query);
            System.out.println("Updated: "+update + "rows");



        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Exception");
        }
    }
}
