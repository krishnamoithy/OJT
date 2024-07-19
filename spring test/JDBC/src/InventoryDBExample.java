import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InventoryDBExample {
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        String databaseName = "InventoryDB";
        String tableName = "Products";

        try {

            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // Create a new database
            createDatabase(connection, databaseName);

            connection.setCatalog(databaseName);

            createTable(connection, tableName);

            // Close the connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private static void createDatabase(Connection connection, String dbName) throws SQLException {
        String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS " + dbName;
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(createDatabaseSQL);
            System.out.println("Database created successfully");
        }
    }

    private static void createTable(Connection connection, String tableName) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS " + tableName + " ("
                + "product_id INT AUTO_INCREMENT PRIMARY KEY, "
                + "product_name VARCHAR(255) NOT NULL, "
                + "price DOUBLE NOT NULL, "
                + "stock_quantity INT NOT NULL)";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(createTableSQL);
            System.out.println("Table created successfully");
        }
    }
}


