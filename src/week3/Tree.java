package week3;


public class Tree extends Plants{

    public Tree(String name, double length ){
        super(name, length);
    }

    @Override
    public String toString() {
        return "name " + getName() + ", No. of Legs " + getLength();
    }
}