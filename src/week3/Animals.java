package week3;

public class Animals extends Organism{

    private int numberOfLegs;
    private static int count = 0;

    public Animals(String name, int numberOfLegs){
        super(name);
        this.numberOfLegs = numberOfLegs;
        count++;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public static int getCount() {
        return count;
    }

    public void speak(){
        System.out.println("Animal is speaking");
    }
}