package week3;

public class Plants extends Organism {

    private double length;
    private static int count = 0;

    public Plants(String name, double length ){
        super(name);
        this.length = length;
        count++;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public static int getCount() {
        return count;
    }

    public void sleep(){
        System.out.println("Plant is sleeping");
    }
}