import java.sql.*;
 
public class CRUD {
    //database connection
    private static final String URL= "jdbc:mysql://localhost:3306/krishna";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    public static void createUser(int id, String name, String email){
        String query= "insert into interndetails(id,name,email)values(?,?,?)";
        try(Connection conn=DriverManager.getConnection(URL,USER,PASSWORD);
            PreparedStatement ps=conn.prepareStatement(query)){ // PreparedStatement is a class used to execute the mysql queries
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, email);
            int rowsInserted = ps.executeUpdate();
            System.out.println("Rows Inserted: "+ rowsInserted);
           }
           catch(SQLException e){
               e.printStackTrace();
           }
       }   
        //read/retrieve all interns data                    
        public static void readUser(){
            String query= "select * from interndetails";
            try(Connection conn= DriverManager.getConnection(URL,USER,PASSWORD);
                   Statement st =conn.createStatement();
                   ResultSet rs = st.executeQuery(query)
                  ){
                  System.out.println("Intern Details: ");
                  while(rs.next()){
                      int id = rs.getInt("id");
                      String name = rs.getString("name");
                      String email = rs.getString("email");
                      System.out.println("Id: "+id+", Name: "+name+", email: "+email);
                  }
              }
              catch(SQLException e){
                  e.printStackTrace();
              }
          }
        public static void updateUser(int id, String newemail){
            String query = "update interndetails set email=? where id =?";
            try(Connection conn=DriverManager.getConnection(URL,USER,PASSWORD);
                    PreparedStatement ps = conn.prepareStatement(query)){
                ps.setString(1,newemail);
                ps.setInt(2,id);
                int rowsUpdated = ps.executeUpdate();
                System.out.println("Rows updated: "+rowsUpdated);
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        public static void deleteUser(int id){
            String query="delete from interndetails where id =?";
            try(Connection conn=DriverManager.getConnection(URL,USER,PASSWORD);
                    PreparedStatement ps = conn.prepareStatement(query)){
                ps.setInt(1,id);
                int rowsDeleted = ps.executeUpdate();
                System.out.println("Rows deleted: "+rowsDeleted);
            }
            catch(SQLException e){
                e.printStackTrace();
            }
            }
    public static void main(String[] args) {
       //create a new intern data
       //createUser(1,"Arpita","arpita@edunetfoundation.org");
       // retrieving all the data from the table
       readUser();
       //createUser(2,"Lisy","lisy@gmail.com");
       //updateUser(1,"arpita@gmail.com");
       deleteUser(2);
       readUser();
    }
}
