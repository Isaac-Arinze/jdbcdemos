package week4;


import java.sql.*;
import java.util.Scanner;

public class JDBCDemo5 {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/programmers";
    private static final String username = "root";
    private static final String password = "zikans@19";

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            String query = String.format("INSERT INTO Engineers (name, age, marks) VALUES (?, ?, ?)");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            Statement statement = connection.createStatement();
            Scanner scanner = new Scanner(System.in);
            while (true){
                System.out.print("Enter name: ");
                String name = scanner.next();
                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                System.out.print("Enter Marks: ");
                double marks = scanner.nextDouble();
                System.out.println("Enter more data (Y/N)");
                String choice = scanner.next();
                preparedStatement.setString(1, name);
                preparedStatement.setInt(2, age);
                preparedStatement.setDouble(3, marks);
                preparedStatement .addBatch();

                if (choice.toUpperCase().equals("N")){
                    break;
                }
            }
            int[] arr = preparedStatement.executeBatch();
            for (int i = 0; i <arr.length ; i++) {
                if(arr[i] == 0){
                    System.out.println("Query: "+i+ "Not successfully executed" );

                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

