package week1;

//10 Fibonacci numbers -> 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
public class Fibonacci {

    public static void printFibonacciNumber( int number ){
        int firstNumber = 0;
        int secondNumber = 1;
        int totalFirstAndSecond;
        System.out.print(firstNumber + ", ");
        System.out.print(secondNumber + ", ");
        for( int i = 3; i <= number; i++ ){
            totalFirstAndSecond = firstNumber + secondNumber;
            System.out.print(totalFirstAndSecond + ", ");
            firstNumber = secondNumber;
            secondNumber = totalFirstAndSecond;
        }
    }

    public static void main(String[] args) {
        printFibonacciNumber(15);
    }

}