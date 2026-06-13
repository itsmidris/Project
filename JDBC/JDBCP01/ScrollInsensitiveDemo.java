package JDBCP01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollInsensitiveDemo {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Loading Driver Class

            Connection con = DriverManager.getConnection(
                    "JDBC:mysql://localhost:3306/mystd", "root", "1234");
            Statement statement= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String query="select * from student";

            System.out.println("--------Fetch Data in no live update/edit mode-----------");

            Thread.sleep(10000);

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
