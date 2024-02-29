package week1;

import java.util.Scanner;

public class DecimalToBinary {
    //4 -> 100, 7 -> 111

    public String covertDecimalToBinary(int number){
        String binaryString = "";

        while( number > 0 ){
            int remainder = number % 2;
            binaryString.concat(String.valueOf(remainder));
            number /= 2;
        }
        return reverseString(binaryString);
    }

    private String reverseString(String string){
        //abcd -> dcba
        String reversed = "";
        int lastIndex = string.length() - 1;
        while( lastIndex >= 0 ){
            reversed.concat(String.valueOf(string.charAt(lastIndex))); //1 -> "1"
            lastIndex--;
        }
        return reversed;
    }

    public static void main(String[] args) {
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the integer number: ");
        int number = scanner.nextInt();
        String binary = decimalToBinary.covertDecimalToBinary(number);
        System.out.println("This is the binary output of " + number + " : " + binary);
    }

}
