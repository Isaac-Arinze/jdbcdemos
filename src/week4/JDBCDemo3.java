package week4;


import java.sql.*;

public class JDBCDemo3{

    //    Create a connection string
    private static final String url = "jdbc:mysql://127.0.0.1:3306/programmers";
    private static final String username = "root";
    private static final String password = "zikans@19";

    public static void main(String[] args) {

        try {
            Class.forName(  "com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException exception) {
            System.out.println(exception.getMessage());

//            exception.printStackTrace();
        };
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
//            String query = String.format("UPDATE Engineers SET marks = %s WHERE id = %d", 100,  8); update command
            String query = String.format("DELETE Engineers WHERE id = 2" )
            //String query = "Select * from Engineers";  - select table from database
            int rowsAffected = statement.executeUpdate(query);

            if (rowsAffected>0){
                System.out.println("Data successfully deleted");
//                System.out.println("data updated successfully");
            }else {
                System.out.println("Data Not Deleted");
            } 

        }catch (SQLException e) {

        }

    }
}

