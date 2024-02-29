package practice;

public class ClassMethod {

    public String name;
    public int age;

    public ClassMethod(String name, int age) {
        this.name = name;
        this.age = 45;
    }

    final String NAME = "jAMES";

    public static void main(String args[]) {
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
}
