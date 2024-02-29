package week3;

public class Bank {

    int[] Account(int Deposit, int withdrawal) {
        int arr[] = new int[(Deposit - withdrawal) + 1];

        for (int i = 0; i<arr.length; i++){
            arr[i] = withdrawal++;
        }
            return arr;
    }

    public static void main(String[] args) {
        ScopeTest scopeTest = new ScopeTest();
        scopeTest.printTest();

        int theBalance[];

        Bank balance = new Bank();
    theBalance =  balance.Account(10, 1);


      for (int i=0; i<theBalance.length; i++){
          System.out.println(theBalance[i] + " ");
      }
        System.out.println(" ] ");

    }


}
class ScopeTest {
    int test = 10;
    void printTest () {
        int test = 20;
        System.out.println("test =" + test);
    }


}