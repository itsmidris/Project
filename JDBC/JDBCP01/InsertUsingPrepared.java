package JDBCP01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertUsingPrepared {

    public static void main(String[] args) {

        //Using Prepared Statement
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Loading Driver Class

            Connection con = DriverManager.getConnection(
                    "JDBC:mysql://localhost:3306/mystd", "root", "1234");
            Statement statement= con.createStatement();
            String query="insert into student(id,stdName,age) values (?,?,?)";

            PreparedStatement preparedStatement = con.prepareStatement(query);

            preparedStatement.setInt(1,1);
            preparedStatement.setString(2,"Imran");
            preparedStatement.setInt(3,5);
            preparedStatement.executeUpdate();

            preparedStatement.setInt(1,102);
            preparedStatement.setString(2,"Abhishek");
            preparedStatement.setInt(3,6);
            preparedStatement.executeUpdate();

            con.close();
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Exception");
        }
    }
}
