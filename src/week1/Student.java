package week1;


public class Student {

    private String name;
    private int age;
    private String gender;
    private String studentClass;

    private static int numberOfStudents;

    //Constructor with 4 arguments to create a Student object
    public Student(String name, int age, String gender, String studentClass) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.studentClass = studentClass;
        numberOfStudents++;
    }

    public static int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return "Student name: " + getName() + ", Age: " + this.age + ", Gender: " + gender + ", Student Class: " + studentClass;
    }
}


class StudentTest{
    public static void main(String[] args) {

        Student student1 = new Student("Adebola Jegede", 35, "Male", "Java");
        System.out.println(student1 );
        System.out.println( Student.getNumberOfStudents() );

        Student student2 = new JavaStudent("Donatus Nwigwe", 39, "Male", "Python", 4);
        System.out.println(student2);
        System.out.println( Student.getNumberOfStudents() );

        JavaStudent student3 = (JavaStudent)(new Student("Donatus Nwigwe", 39, "Male", "Python"));
        student3.setNumberOfMonths(4);
        System.out.println( Student.getNumberOfStudents() );


    }
}