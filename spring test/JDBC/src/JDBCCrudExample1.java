import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCrudExample1 {
    public static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        String databaseName = "testdb";
        String tableName = "users";

        try {
            // Establishing a connection
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            createDatabase(connection, databaseName);

            connection.setCatalog(databaseName);
            createTable(connection, tableName);

            createRecord(connection, tableName, "krishna", "krishna@gamil.com");
            createRecord(connection, tableName, "moorthy", "moortny@gmail.com");

            readRecords(connection, tableName);

            updateRecord(connection, tableName, 1, "kd", "kd@gmail.com");

            deleteRecord(connection, tableName, 1);

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Create a new database
    private static void createDatabase(Connection connection, String dbName) throws SQLException {
        String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS " + dbName;
        Statement statement = connection.createStatement();
        statement.executeUpdate(createDatabaseSQL);
        System.out.println("Database created successfully");
    }

    // Create a new table
    private static void createTable(Connection connection, String tableName) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS " + tableName + " ("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "name VARCHAR(100) NOT NULL, "
                + "email VARCHAR(100) NOT NULL)";
        Statement statement = connection.createStatement();
        statement.executeUpdate(createTableSQL);
        System.out.println("Table created successfully");
    }

    // Create a new record
    public static void createRecord(Connection connection, String tableName, String name, String email) throws SQLException {
        String insertSql = "INSERT INTO " + tableName + " (name, email) VALUES (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, email);
        preparedStatement.executeUpdate();
        System.out.println("Record created successfully");
    }

    // Read records from the database
    private static void readRecords(Connection connection, String tableName) throws SQLException {
        String selectSql = "SELECT * FROM " + tableName;
        PreparedStatement preparedStatement = connection.prepareStatement(selectSql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
        }
    }

    // Update a record
    private static void updateRecord(Connection connection, String tableName, int id, String name, String email) throws SQLException {
        String updateSql = "UPDATE " + tableName + " SET name = ?, email = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(updateSql);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, email);
        preparedStatement.setInt(3, id);
        int rowsUpdated = preparedStatement.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Record updated successfully");
        } else {
            System.out.println("Record with ID " + id + " not found");
        }
    }

    // Delete a record
    public static void deleteRecord(Connection connection, String tableName, int id) throws SQLException {
        String deleteSql = "DELETE FROM " + tableName + " WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(deleteSql);
        preparedStatement.setInt(1, id);
        int rowsDeleted = preparedStatement.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("Record deleted successfully");
        } else {
            System.out.println("Record with ID " + id + " not found");
        }
    }
}
