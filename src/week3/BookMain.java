package week3;

public class BookMain {
    public static void main(String[] args) {
        Books book = new Books("Power", "MM", 2000, 200);
        book.intermediateSetter(500);

        System.out.println(book);
    }
}