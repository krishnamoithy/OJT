import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    //Database URL,username,password
    private static final String URL="jdbc:mysql://localhost:3306/krishna";
    private static final String USER="root";
    private static final String PASSWORD="root";

    public static void main(String[] args){
        Connection connection=null;
        try{
            //establishing the connection
            connection=DriverManager.getConnection(URL,USER,PASSWORD);

            if(connection!=null) {
                System.out.println("Connection successful connected to the database");
            }
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Failed to connect the database!");
        }finally {
            //close the connection
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
}