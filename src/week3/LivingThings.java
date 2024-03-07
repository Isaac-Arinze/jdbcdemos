package week3;

public abstract class LivingThings {
    private String name;
    private  int age;

    //constructor
    public LivingThings(String name, int age){
        this.name = name;
        this.age = age;
    }

    //getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }


    //abstract
    abstract void speak();
    abstract void sleep();


}