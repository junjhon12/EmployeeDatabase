import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // Database connection details
    private static final String URL = "jdbc:mysql://localhost:3306/employeeData"; // Replace "employeeData" with your database name if needed
    private static final String USER = "root"; // Your MySQL username
    private static final String PASSWORD = "Mi030403211!!!!"; // Your MySQL password

    /**
     * Establishes and returns a connection to the database.
     * @return Connection object if successful, or null if the connection fails.
     */
    public static Connection getConnection() {
        Connection connection = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connection successful!");

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found. Make sure the JAR file is added to the classpath.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed! Check the database URL, username, or password.");
            e.printStackTrace();
        }

        return connection;
    }
}
