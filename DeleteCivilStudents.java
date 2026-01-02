package assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteCivilStudents {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college", "root", "rajo");

            Statement stmt = con.createStatement();

            String query = """
                DELETE FROM Students
                WHERE year_of_passing = 2024 AND branch = 'Civil'
            """;

            int rows = stmt.executeUpdate(query);
            System.out.println(rows + " records deleted");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

