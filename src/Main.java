import week3.EncapsulationDemo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        EncapsulationDemo demo = new EncapsulationDemo("Skytech", 56,
                "James", "Access-denied", "String");
        System.out.println(demo);


        String[] products = {"Milk", "Milo", "Drink", "Soap"};
        String[] items = {"Ball", "Match", "Play"};

        int[][] inventory = new int[2][2];
        inventory[1][1] = 5;
        inventory[0][1] = 9;

        System.out.println(Arrays.asList(products));

        for (String item : items) {
            System.out.println(item);

        }
    }
}
