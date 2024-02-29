package week2;

import java.util.Scanner;

class Solution {
    static char result;

    public static char findTheDifference(String s, String t) {

        for (int i = 0; i < t.length(); i++) {
            result = t.charAt(i);
            if (s.contains(result + "")) {
                continue;
            }
            break;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string :  - s");
        String s = scanner.nextLine();
        System.out.println("Enter the second string -  t");
        String t = scanner.nextLine();

        System.out.println(Solution.findTheDifference(s, t));
    }

}
