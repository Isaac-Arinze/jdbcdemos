package week3;


public class ExecuteLiving {
    public static void main(String[] args) {
        Human man = new Human("Mike", 50);
        System.out.println(man);
        man.move();
        man.eat();
        man.sleep();
        man.speak();
        System.out.println();

        //Animal
        Animal domesticAnimal = new Animal("Dog", 5);
        System.out.println(domesticAnimal);
        domesticAnimal.move();
        domesticAnimal.eat();
        domesticAnimal.sleep();
        domesticAnimal.speak();




    }
}