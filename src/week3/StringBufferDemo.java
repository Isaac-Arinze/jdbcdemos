package week3;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello World");

        //append() method
        buffer.append("This is a test");
        System.out.println(buffer);

        //insert() method
        buffer.insert(7, "Java");
        System.out.println(buffer);

        //delete() method
        buffer.delete(7, 12);
        System.out.println(buffer);


        //reverse() method
        buffer.reverse();
        System.out.println(buffer);

        //replace method
        buffer.replace(7, 12, "everyone");
        System.out.println(buffer);

        // setLength (x) method to clear buffer
        buffer.setLength(0);
        System.out.println(buffer.length());

    }
}
