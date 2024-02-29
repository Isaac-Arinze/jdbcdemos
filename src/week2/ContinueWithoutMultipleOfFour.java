package week2;

public class ContinueWithoutMultipleOfFour {
    public static void main(String[] args) {

        int num = 1;

        do{
            if (num % 4 == 0){

                num ++;
                continue;
            }
            System.out.println(num);
            num++;
        }
        while (num <=25 );
    }
}
