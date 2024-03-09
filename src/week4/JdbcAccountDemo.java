package week4;

import java.sql.*;
import java.util.Scanner;

public class JdbcAccountDemo {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/lendsqr";
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
//            connection.setAutoCommit(false);
            String debit_query = "UPDATE Account SET balance = balance - ? WHERE account_Number = ?";
            String credit_query = "UPDATE Account SET balance = balance + ? WHERE account_Number = ?";
            PreparedStatement debitpreparedStatement = connection.prepareStatement(debit_query);
            PreparedStatement creditPreparedStatement = connection.prepareStatement(credit_query);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Account Number: ");
            int account_Number = scanner.nextInt();

            System.out.println("Enter Amount: ");
            double amount = scanner.nextDouble();

            debitpreparedStatement.setDouble(1, amount);
            debitpreparedStatement.setInt(2, account_Number);
            creditPreparedStatement.setDouble(1, amount);
            creditPreparedStatement.setInt(2, 2140972311);
            debitpreparedStatement.executeUpdate();
            creditPreparedStatement.executeUpdate();

            if (isSufficient(connection,   account_Number, amount)) {
                connection.commit();
                System.out.println("Transaction successful");
            }else {
                System.out.println("Transaction failed!!");
//                System.out.println("insufficient balance");
            }
                    creditPreparedStatement.executeUpdate();
                    debitpreparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static boolean isSufficient(Connection connection, int account_Number, double amount) {
        try {
            String query = "SELECT balance FROM Account WHERE account_Number = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, account_Number);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                double currentBalance = resultSet.getDouble("balance");
                if (amount > currentBalance) {
                    return false;
                } else {
                    return true;
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}



