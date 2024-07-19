import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LibraryDBExample {
    private static final String URL = "jdbc:mysql://localhost:3306/LibraryDB";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try {
            // Establish a connection to the MySQL database
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // Insert sample data into the Books table
            insertBook(connection, "The KD", "KD KRISHNA", 10);
            insertBook(connection, "To Killer krishna", "KD KRISHNA", 5);
            insertBook(connection, "1994 case of KD KRISHNA", "KD KRISHNA", 8);

            // Update the quantity of a book based on its book_id
            updateBookQuantity(connection, 1, 15);

            // Delete a book record based on its book_id
            deleteBook(connection, 2);

            // Retrieve and print all records from the Books table
            readBooks(connection);

            // Close the connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to insert a new book record into the Books table
    private static void insertBook(Connection connection, String title, String author, int quantity) throws SQLException {
        String insertSQL = "INSERT INTO Books (title, author, quantity) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, author);
            preparedStatement.setInt(3, quantity);
            preparedStatement.executeUpdate();
            System.out.println("Book inserted successfully: " + title + " by " + author);
        }
    }

    // Method to update the quantity of a book based on its book_id
    private static void updateBookQuantity(Connection connection, int bookId, int newQuantity) throws SQLException {
        String updateSQL = "UPDATE Books SET quantity = ? WHERE book_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
            preparedStatement.setInt(1, newQuantity);
            preparedStatement.setInt(2, bookId);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Book quantity updated successfully for book_id: " + bookId);
            } else {
                System.out.println("No book found with book_id: " + bookId);
            }
        }
    }

    // Method to delete a book record based on its book_id
    private static void deleteBook(Connection connection, int bookId) throws SQLException {
        String deleteSQL = "DELETE FROM Books WHERE book_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {
            preparedStatement.setInt(1, bookId);
            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Book deleted successfully with book_id: " + bookId);
            } else {
                System.out.println("No book found with book_id: " + bookId);
            }
        }
    }

    // Method to read and print all records from the Books table
    private static void readBooks(Connection connection) throws SQLException {
        String selectSQL = "SELECT * FROM Books";
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectSQL)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int bookId = resultSet.getInt("book_id");
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                int quantity = resultSet.getInt("quantity");
                System.out.println("ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Quantity: " + quantity);
            }
        }
    }
}
