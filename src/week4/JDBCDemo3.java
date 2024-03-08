package week4;


import java.sql.*;

public class JDBCDemo3 {

    //    Create a connection string
    private static final String url = "jdbc:mysql://127.0.0.1:3306/programmers";
    private static final String username = "root";
    private static final String password = "zikans@19";

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException exception) {
            System.out.println(exception.getMessage());

//            exception.printStackTrace();
        }
        ;
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO Engineers (name, age, marks) VALUES (?, ?, ?)"; // ADDING A Placeholder
//            Statement statement = connection.createStatement();
//            String query = String.format("UPDATE Engineers SET marks = %s WHERE id = %d", 100,  8); update command
            //String query = "Select * from Engineers";  - select table from database
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "Johnbull");
            preparedStatement.setInt(2, 25);
            preparedStatement.setDouble(3, 89.96);

            preparedStatement.setString(1, "james");
            preparedStatement.setInt(2, 12);
            preparedStatement.setDouble(3, 49.98);


            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data inserted succefully");
//                System.out.println("data updated successfully");
            } else {
                System.out.println("Data Not Inserted successfully");
            }
        } catch (SQLException e) {

        }

    }
}

