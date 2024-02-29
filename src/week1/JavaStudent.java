package week1;


public class JavaStudent extends Student{

    private int numberOfMonths;

    public JavaStudent(String name, int age, String gender, String studentClass, int numberOfMonths) {
        super(name, age, gender, studentClass);
        this.numberOfMonths = numberOfMonths;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public void setNumberOfMonths(int numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }
}
