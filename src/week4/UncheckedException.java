package week4;

public class UncheckedException {
    public static int divide(int a, int b) {

        int result = 0;

//        try {
            result = a / b;
//        } catch (Exception exception) {
//            System.out.println("There was an exception  " + exception.getMessage() + exception.getClass());
//        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println((divide(10, 0)));
    }

    ;

}
