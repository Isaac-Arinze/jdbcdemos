package week3;


public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello World");

        //append() method
        builder.append("This is a tests");
        System.out.println(builder);

        //insert() method
        builder.insert(7, "Java");
        System.out.println(builder);

        //delete() method
        builder.delete(7, 12);
        System.out.println(builder);


        //reverse() method
        builder.reverse();
        System.out.println(builder);

        //replace method
        builder.replace(7, 12, "everyone");
        System.out.println(builder);

        // setLength (x) method to clear buffer
        builder.setLength(0);
        System.out.println(builder.length());

    }
}
