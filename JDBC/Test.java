import java.sql.*;

public class Test {
    public static void main() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd","root","1234");

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select * from student");

        while (rs.next()){
            System.out.println(rs.getString("stdName"));
        }

        rs.close();
        st.close();
        con.close();




    }
}
