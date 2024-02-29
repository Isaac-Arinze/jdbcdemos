package week3;

public class ShapeTest {
    public static void main(String[] args) {

        Week3.Shape circle = new Circle("Red", 8.5);
        Week3.Shape rectangle = new Rectangle("Blue", 9.3, 5.7);
        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());

    }
}