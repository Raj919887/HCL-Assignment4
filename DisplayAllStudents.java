package assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayAllStudents {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "rajo"; 

        try {
             Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();

            String query = "SELECT * FROM Students";

            ResultSet rs = stmt.executeQuery(query);

            System.out.println("ID  Name   Branch  Semester  Percentage  Year");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + "   " +
                    rs.getString("name") + "   " +
                    rs.getString("branch") + "      " +
                    rs.getInt("semester") + "        " +
                    rs.getDouble("percentage") + "        " +
                    rs.getInt("year_of_passing")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
