package week3;


public class Dog extends Animals {

    public Dog(String name, int numberOfLegs){
        super(name, numberOfLegs);
    }

    @Override
    public String toString() {
        return "name " + getName() + ", No. of Legs " + getNumberOfLegs();
    }

    @Override
    public void speak() {
        System.out.println("Dog is barking");
    }
}