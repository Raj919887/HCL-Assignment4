package assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateInsertStudents {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college", "root", "rajo");

            Statement stmt = con.createStatement();
            
            // Table creation query

//            String createTable = """
//                CREATE TABLE IF NOT EXISTS Students (
//                    id INT PRIMARY KEY AUTO_INCREMENT,
//                    name VARCHAR(50),
//                    branch VARCHAR(20),
//                    semester INT,
//                    percentage DOUBLE,
//                    year_of_passing INT
//                )
//            """;
//
//            stmt.executeUpdate(createTable);

            String insertData = """
                INSERT INTO Students (name, branch, semester, percentage, year_of_passing)
                VALUES
                ('Ravi', 'CSE', 7, 75.0, 2025),
                ('Anita', 'EC', 7, 78.5, 2024),
                ('Kiran', 'Civil', 6, 72.0, 2024)
            """;

            stmt.executeUpdate(insertData);

            System.out.println("Table created and records inserted");
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

