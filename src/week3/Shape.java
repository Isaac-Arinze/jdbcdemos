package Week3;

public abstract class Shape {
    protected String color;

    public Shape(String color){
        this.color = color;
    }

    public abstract double calculateArea();

    public void display(){
        System.out.println("This is a " + color + " shape");
    }
}