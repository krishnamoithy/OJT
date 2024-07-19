import java.sql.Connection; //establishing a connection to the database
import java.sql.DriverManager;//manages the database drivers and used establish a connection to the database
import java.sql.PreparedStatement;//interface,used to execute sql queries with parameter placeholders
import java.sql.ResultSet;//interface set to database query
import java.sql.SQLException;
public class JDBCCrudExample{
    private static final String URL="jdbc:mysql://localhost:3306/krishna";
    private static final String USER="root";
    private static final String PASSWORD="root";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            //CREATE A RECORD
            createRecord(connection, "krishna moorthy", "krishna100602@gmail.com");
            //read record
            readRecords(connection);
            //update
            updateRecord(connection, 1, "KDkrishna", "krishna143@gmail.com");
            //delete operation
            deleteRecord(connection, 1);
            //close the connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Create a new Record
    public static void createRecord(Connection connection,String name,String email) throws SQLException{
        String insertSQL= "INSERT INTO users(name,email) VALUES (?,?)";
        PreparedStatement preparedStatement=connection.prepareStatement(insertSQL);
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,email);
        preparedStatement.executeUpdate();
        System.out.println("Record Created Successfully");


    }


//read records from the database

    private static void readRecords(Connection connection) throws SQLException{
        String selectSQL="SELECT *FROM users";
        PreparedStatement preparedStatement=connection.prepareStatement(selectSQL);
        ResultSet resultSet=preparedStatement.executeQuery();

        while(resultSet.next()){
            int id=resultSet.getInt("id");
            String name=resultSet.getString("name");
            String email=resultSet.getString("email");
            System.out.println("id:"+id+",Name"+name+",Email:"+email);
        }
    }

    //Update the record
    private static void updateRecord(Connection connection,int id,String name,String email) throws SQLException {
        String updateSQL = "UPDATE users SET name=?,email=? WHERE id = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(updateSQL);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, email);
        preparedStatement.setInt(3, id);
        preparedStatement.executeUpdate();
        System.out.println("Record Updated Succesfully");
    }
//Delete a record from the database

    private static void deleteRecord(Connection connection,int id)  throws SQLException{
        String deleteSQL="DELETE FROM users WHERE id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL);
        preparedStatement.setInt(1,id);
        preparedStatement.executeUpdate();
        System.out.println("Record deleted successfully");

    }
}



