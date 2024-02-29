package week2;


import week1.Student;

import java.util.Scanner;

public class MethodDemo {
    static Scanner scanner = new Scanner(System.in);
    public static Student createStudent(){
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter student gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter student class: ");
        String studentClass = scanner.nextLine();

        Student isaac = new Student(name, age, gender, studentClass);
        return isaac;
    }

    public static void main(String[] args) {
        Student student = createStudent();
        System.out.println(student);
    }

}

/*
private String name;
    private int age;
    private String gender;
    private String studentClass;
 */