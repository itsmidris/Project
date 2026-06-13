package JDBCP01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCInsertDemo {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Loading Driver Class

            Connection con = DriverManager.getConnection(
                    "JDBC:mysql://localhost:3306/mystd", "root", "1234");
            Statement statement= con.createStatement();
            String query="INSERT INTO student(id,stdName,age) values (3,'Ankit', 21)";


            //ResultSet rs = statement.executeQuery(query);
            int update = statement.executeUpdate(query);
            System.out.println("Inserted: "+update + "rows");



        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Exception");
        }
    }
}
