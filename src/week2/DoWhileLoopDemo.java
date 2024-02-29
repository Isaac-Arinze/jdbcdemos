package week2;

import java.util.Scanner;

public class DoWhileLoopDemo {
    public static void main(String[] args) {

        int count = 1;
        do{
            System.out.println(count);
            count++;
        } while (count <= 40 );

        Scanner scanner = new Scanner(System.in);
        String word;
        do{
            System.out.println("Please enter a word, enter 'quit' to terminate");
            word = scanner.nextLine();
            System.out.println("You entered: " + word);
        } while( !word.equals("quit") );

    }
}