package practice;
import week1.GraduateStudents;
import week1.GraduateStudents.*;

public class ClassMethod extends Calc implements MyFirstInterface{
    java.lang.String name;
    public int age;

    public ClassMethod(String name, int age) {
        this.name = name;
        this.age = 45;
    }
    @Override
    public double calcAreaOfACylinder(double pi, double radius, double height){
        return pi * radius * radius * height * height;
    }
    final String NAME = "JAMES";
    public static void main(String args[]) {
        GraduateStudents students = new GraduateStudents(
                "Junior", 34, "male", ".NET",
                "PROJECT", "Daniel");
        System.out.println(students);

        Calc cal = new Calc();

        cal.calcAreaOfACylinder(12,23,4);
        int sum = 0;

        for (int i=0; i< args.length; i++){
          sum += Integer.parseInt(args[i]);
        }
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + ((float)sum/ (float)args.length));

    }

    public String run(){
        final String AcctNo = "2140972311";
        return AcctNo;
    }
    void printScreen(String a, String b){
        System.out.println("i am a java student");
    }
    void printScreen(String a, String b, String c){

        System.out.println("another arguments has been passed");
        System.out.println(this.getClass().getName());
    }
    void printScreen(){

    }
}
