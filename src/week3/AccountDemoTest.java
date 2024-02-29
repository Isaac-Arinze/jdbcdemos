package week3;


public class AccountDemoTest {
    public static void main(String[] args) {

        ThisAccountDemo savingAccount = new SavingsAccountDemo("0020457845", "Saheed Ade");
        savingAccount.setAccountBalance(500000);
        ThisAccountDemo currentAccount = new CurrentAccountDemo("1005412453", "Oluwakemi Obi");
        currentAccount.setAccountBalance(800000);

        System.out.println(savingAccount);
        System.out.println(currentAccount);

        savingAccount.deposit(1000000);
        System.out.println(savingAccount);
        System.out.println();

        savingAccount.withdraw(5000000);
        System.out.println(savingAccount);
        System.out.println();

        savingAccount.transfer(currentAccount, 200000);
        System.out.println(savingAccount);
        System.out.println(currentAccount);

        System.out.println(ThisAccountDemo.getUserCount());


    }
}