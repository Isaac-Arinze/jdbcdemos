package week2;



import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        int[] seriesTotal = new int[4];

        Scanner scanner = new Scanner(System.in);
        int count = 1, total = 0;
        do{
            for( int i = 0; i < 5; i++ ){
                System.out.println("Please enter an integer: ");
                int entered = scanner.nextInt();
                total += entered;
            }
            seriesTotal[count-1] = total;
            total = 0;
            count++;
        } while( count < 5);

        int overallTotal = 0;
        for( int i = 0; i < seriesTotal.length; i++ ){
            System.out.printf("Series %d total is %d\n", i+1, seriesTotal[i]);
            overallTotal += seriesTotal[i];
        }
        System.out.println("Overall total = "+ overallTotal);

    }
}