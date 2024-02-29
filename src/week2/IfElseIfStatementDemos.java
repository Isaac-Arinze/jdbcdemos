package week2;



public class IfElseIfStatementDemos {
    public static void main(String[] args) {
        int x = 45, y = 45, z = 45;

        if( x >= y ){
            System.out.println("x is greater than or equal to y");
        } else if(y >= z ){
            System.out.println("y is greater than or equal z");
        } else if( z >= y ){
            System.out.println("z is greater than y which is greater than x");
        } else {
            System.out.println("All the numbers are equal");
        }

    }
}