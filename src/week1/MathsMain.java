package week1;

public class MathsMain {
    public static void main(String[] args) {
        Mathematics mathematics = new Mathematics();

        System.out.println(Mathematics.addition(10, 2));
        System.out.println(mathematics.subtraction(10, 2));
        System.out.println(mathematics.multiply(10, 2));
        System.out.println(mathematics.divide(10, 2));

    }
}
