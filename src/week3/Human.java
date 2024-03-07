package week3;

public class Human extends LivingThings implements Living {

    public Human(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("i eat Rice");
    }

    @Override
    public void move() {
        System.out.println("i move on 2-legs");
    }

    @Override
    void sleep() {
        System.out.println("i sleep in a bedroom");
    }

    @Override
    void speak() {
        System.out.println("i speak in Yoruba or English");
    }


    @Override
    public String toString() {
        return "Name: " + getName() + " Age: " + getAge();
    }


    }
