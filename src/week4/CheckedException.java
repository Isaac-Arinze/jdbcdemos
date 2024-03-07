package week4;

public class CheckedException {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            if (1 % 3 == 0) {

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException exception) {
                    System.out.println("The thread was interrupted " + exception.getMessage() + exception.getClass());
                }
            }
            System.out.println(i);
        }
    }
}
