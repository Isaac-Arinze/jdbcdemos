package week3;

public class Animal extends LivingThings implements Living{

    public Animal(String name, int age){
        super(name, age);

    }

    @Override
    public void eat(){
        System.out.println("i eat bones");
    }
    public void move(){
        System.out.println("i move on 4-legs");
    }
    public void sleep(){
        System.out.println("i sleep in cages");
    }
    public void speak(){
        System.out.println("i speak by barking");
    }

    @Override
    public String toString(){
        return "Name: " + getName()+ " Age: " + getAge();
    }
}
