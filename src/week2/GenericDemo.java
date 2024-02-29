package week2;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {

    public static void main(String[] args) {

        List <String> strings = new ArrayList<String>();

        strings.add("Fisrt class");
        strings.add("Second Class");

        String newClass= strings.get(0);
        System.out.println(newClass);
    }
}

