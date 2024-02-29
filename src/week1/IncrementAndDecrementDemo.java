package week1;

public class IncrementAndDecrementDemo {
    public static void main(String[] args) {
        int count = 5;

        //Different types of print methods: println; print; printf; we are using printf here
        //Escape characters can be used with println, printf, and print methods (\n, \t)

        int postIncrement = count++;
        System.out.printf(String.format("The postIncrement is: %d and count is: %d\n", postIncrement, count));
        System.out.println("The postIncrement is: " + postIncrement + " and count is: " + count);
        System.out.print("The postIncrement is: " + postIncrement + " and count is: " + count + "\n");

        int preIncrement = ++count;
        System.out.printf(String.format("The preIncrement is: %s and count is: %d\n", preIncrement, count));
        System.out.println("The preIncrement is: " + preIncrement + " and count is: " + count);
        System.out.print("The preIncrement is: " + preIncrement + " and count is: " + count + "\n");

        int postDecrement = count--;
        System.out.printf(String.format("The postDecrement is: %s and count is: %d\n", postDecrement, count));
        System.out.println("The postDecrement is: " + postDecrement + " and count is: " + count);
        System.out.print("The postDecrement is: " + postDecrement + " and count is: " + count + "\n");

        int preDecrement = --count;
        System.out.printf(String.format("The preDecrement is: %s and count is: %d\n", preDecrement, count));
        System.out.println("The preDecrement is: " + preDecrement + " and count is: " + count);
        System.out.print("The preDecrement is: " + preDecrement + " and count is: " + count + "\n");



    }
}
