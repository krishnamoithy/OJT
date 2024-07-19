import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDBExample {
    private static final String URL = "jdbc:mysql://localhost:3306/CustomerDB";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try {
            // Establish a connection to the MySQL database
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // Insert records into the Customers table
            insertRecord(connection, "krishna", "TN");
            insertRecord(connection, "hari", "KL");
            insertRecord(connection, "pavan", "RT");

            // Retrieve and print all records from the Customers table
            readRecords(connection);

            // Close the connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to insert a new record into the Customers table
    private static void insertRecord(Connection connection, String customerName, String city) throws SQLException {
        String insertSQL = "INSERT INTO Customers (customer_name, city) VALUES (?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, customerName);
            preparedStatement.setString(2, city);
            preparedStatement.executeUpdate();
            System.out.println("Record inserted successfully: " + customerName + ", " + city);
        }
    }

    // Method to read and print all records from the Customers table
    private static void readRecords(Connection connection) throws SQLException {
        String selectSQL = "SELECT * FROM Customers";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(selectSQL);
            while (resultSet.next()) {
                int customerId = resultSet.getInt("customer_id");
                String customerName = resultSet.getString("customer_name");
                String city = resultSet.getString("city");
                System.out.println("ID: " + customerId + ", Name: " + customerName + ", City: " + city);
            }
        }
    }
}
