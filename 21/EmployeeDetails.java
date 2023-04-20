import java.sql.*;

public class EmployeeDetails {
    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "password");

            // Create a statement object to execute SQL statements
            Statement stmt = conn.createStatement();

            // Execute a SELECT statement to retrieve employee data
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            // Process the result set and print the employee details
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String design = rs.getString("design");
                String dept = rs.getString("dept");

                System.out.println("ID: " + id + ", Name: " + name + ", Designation: " + design + ", Department: " + dept);
            }

            // Close the result set, statement, and connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
