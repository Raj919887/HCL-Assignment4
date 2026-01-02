package assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateCSEPercentage {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college", "root", "rajo");

            Statement stmt = con.createStatement();

            String query = """
                UPDATE Students
                SET percentage = percentage + (percentage * 0.05)
                WHERE branch = 'CSE'
            """;

            int rows = stmt.executeUpdate(query);
            System.out.println(rows + " records updated");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

