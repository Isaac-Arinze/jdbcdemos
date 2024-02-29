package week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WildCardGenericDemo {

    public static void ListPrinter (List<? extends Object> ObjectList){
        for (Object object: ObjectList){
            System.out.println(object);
        }
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            integerList.add(i);
        }
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            stringList.add("String");
        }
        ListPrinter(integerList);
        ListPrinter(stringList);
    }
}
