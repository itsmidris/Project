package JDBCP01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollInsensitive {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Loading Driver Class

            Connection con = DriverManager.getConnection(
                    "JDBC:mysql://localhost:3306/mystd", "root", "1234");
            Statement statement= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String query="select * from student";


            ResultSet rs = statement.executeQuery(query);

            System.out.println("--------Scroll Insensitive & read  only-----------");

            rs.last();
            System.out.println("Last Row: " + rs.getInt("id"));
            System.out.println("Last Row: " + rs.getString("stdName"));

            rs.first();
            System.out.println("First Row: " + rs.getInt("id"));
            System.out.println("First Row: " + rs.getString("stdName"));

            rs.absolute(2);
            System.out.println("First Row: " + rs.getInt("id"));
            System.out.println("First Row: " + rs.getString("stdName"));

        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Exception");
        }
    }
}
