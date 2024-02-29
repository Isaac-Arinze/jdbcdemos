package week2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int seriesTotal = 0, series1 =0, series2= 0, series3= 0, series4 =0, total =0, count = 1;
        Scanner scanner = new Scanner(System.in);
        do{
            for( int i = 0; i < 5; i++ ){
                System.out.println("Enter an integer number: ");
                int entered = scanner.nextInt();
                seriesTotal += entered;
            }
            switch(count){
                case 1:
                    series1 = seriesTotal;
                    seriesTotal = 0;
                    total += series1;
                    break;
                case 2:
                    series2 = seriesTotal;
                    seriesTotal = 0;
                    total += series2;
                    break;
                case 3:
                    series3 = seriesTotal;
                    seriesTotal = 0;
                    total += series3;
                    break;
                case 4:
                    series4 = seriesTotal;
                    total += series4;

            }
            count++;
        } while( count < 5);

        System.out.println("Series 1 total = " + series1);
        System.out.println("Series 2 total = " + series2);
        System.out.println("Series 3 total = " + series3);
        System.out.println("Series 4 total = " + series4);
        System.out.println("Overall total = " + total);

    }
}