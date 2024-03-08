package week4;

import java.sql.*;

public class JDBCDemo{

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
            String query = "Select * from Engineers";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double marks = resultSet.getDouble("marks");
                System.out.println("ID: " + id);
                System.out.println("NAME " + name);
                System.out.println("AGE: " + age);
                System.out.println("marks " + marks);   
            }

        }catch (SQLException e) {
            System.out.println(e.getMessage());

        }

    }
}
