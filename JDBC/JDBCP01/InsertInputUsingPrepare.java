package JDBCP01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertInputUsingPrepare {

    public static void main(String[] args) {

        //Using Prepared Statement
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Loading Driver Class

            Connection con = DriverManager.getConnection(
                    "JDBC:mysql://localhost:3306/mystd",
                    "root",
                    "1234");
            Statement statement= con.createStatement();
            String query="insert into student(id,stdName,age) values (?,?,?)";

            PreparedStatement preparedStatement = con.prepareStatement(query);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter Name: ");
            String stdName = scanner.nextLine();

            System.out.println("Enter Age: ");
            int age = scanner.nextInt();

            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,stdName);
            preparedStatement.setInt(3,age);
            preparedStatement.executeUpdate();

            scanner.close();

            con.close();
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Exception");
        }
    }
}
