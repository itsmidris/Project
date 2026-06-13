package JDBCP01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollSensitiveDemo {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Loading Driver Class

            Connection con = DriverManager.getConnection(
                    "JDBC:mysql://localhost:3306/mystd", "root", "1234");
            Statement statement= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String query="select * from student";

            System.out.println("--------Fetch Data in live update/edit mode-----------");

            Thread.sleep(15000);

            ResultSet rs = statement.executeQuery(query);

            rs.beforeFirst();
            while (rs.next()){
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("stdName") + " | " +
                                rs.getInt("age")
                );
            }

            con.close();


        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Exception");
        }
    }
}
