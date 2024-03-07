package practice;

import org.w3c.dom.Node;

public class Calc implements MyFirstInterface, Current{
//    pi, radius and height
    private Node root;

    public static double pi;
    public static double radius;
    public static double  height;

    public  double calcAreaOfACylinder(double pi, double radius, double height) {
        return pi * Math.pow(radius, 2) * height;
    }

    public static void main(String[] args) {
        Calc areaOfCyliner = new Calc();
       double resutl = areaOfCyliner.calcAreaOfACylinder(Math.PI, 2.45, 1.5);
        System.out.println(resutl);
    }

    @Override
    public int withdraw() {
        return 0;
    }

    @Override
    public int theAge() {
        return 0;
    }
}


