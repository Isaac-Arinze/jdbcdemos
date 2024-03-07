package week3;

public class OrganismMain {
    public static void main(String[] args) {

        System.out.println(Animals.getCount());

        Animals dog = new Dog("Grey Hound", 4);
        System.out.println(Animals.getCount());

        Animals dog1 = new Dog("German Shepherd", 4);

        System.out.println(dog);
        dog.speak();
        System.out.println(Animals.getCount());
        System.out.println(dog1);
        dog1.speak();
        System.out.println(Animals.getCount());
        System.out.println();


        Plants tree = new Tree("Date Palm Tree", 45.6);
        System.out.println(tree);
        tree.sleep();
        System.out.println(Plants.getCount());


    }
}
