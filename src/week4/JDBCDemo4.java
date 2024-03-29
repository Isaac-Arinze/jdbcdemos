package week4;


import week3.Sam;

import java.sql.*;
import java.util.Scanner;

public class JDBCDemo4 {
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
            Statement statement = connection.createStatement();
            Scanner scanner = new Scanner(System.in);
            while (true){
                System.out.print("Enter name: ");
                String name =scanner.next();
                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                System.out.print("Enter Marks: ");
                double marks = scanner.nextDouble();
                System.out.println("Enter more data (Y/N)");
                String choice = scanner.next();
                String query = String.format("INSERT INTO Engineers (name, age, marks) VALUES (?, ?, ?)");
               statement.addBatch(query);

                if (choice.toUpperCase().equals("N")){
                    break;
                }
            }
            int[] arr = statement.executeBatch();
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

