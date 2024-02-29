package week2;

public class GenericMethodDemo {

        public static void printArray(Double [] array){
            for (Double doubles : array) {
                System.out.println(doubles);
            }
        }
    public static void printArray(Character [] characters){
        for (Character character: characters) {
            System.out.println(character);
        }
    }
    public static void printArray(Integer [] intArray){
        for (Integer integer : intArray) {
            System.out.println(integer);
        }
    }

        public static void printArray(String[] stringArray){
            for (String string : stringArray){
                System.out.println(string);
            }
        }

    public static void main(String[] args) {
        Integer [] intArray = new Integer[]{3, 5, 30, 45, 5};
            Double[] doubleArray = {2.5, 3.5, 4.5, 6.4, 1.5};
            Character[] characters = {'A', 'B', 'C', 'D', 'E'};
            String[] stringsarray = new String[]{"Mon", "Tues", "Wed", "Thur", "Fri"};
            printArray(intArray);
            printArray(doubleArray);
            printArray(characters);
            printArray(stringsarray);
    }
    }

