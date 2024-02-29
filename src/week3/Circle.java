package week3;

public class Circle extends Week3.Shape {

    private double radius;

    public Circle(String color, double radius ){
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}