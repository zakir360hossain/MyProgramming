package arraylist;

import java.util.ArrayList;

/**
 * @author Zakir Hossain
 * Jan 25, 2020
 * This is the Bank class, with five obects of bank account. The objects are then injected into an ArrayList.
 * With an enhanced for loop, the deposit() and withdraw() methods of Bank are being called to each account.
 * And the data is being modified according to the methods
 */
public class BankTest {
    public static void main(String[] args) {
        // Instantiating accounts
        Bank acc1 = new Bank("Vijay Anne", 2000);
        Bank acc2 = new Bank("Harold Kumar", 100);
        Bank acc3 = new Bank("Tobey Hamlet", 500);
        Bank acc4 = new Bank("Arthur Fonz", 167);
        Bank acc5 = new Bank("Buster Keaton", 11000);

        ArrayList<Bank> accountList = new ArrayList<>();
        accountList.add(acc1);
        accountList.add(acc2);
        accountList.add(acc3);
        accountList.add(acc4);
        accountList.add(acc5);
        System.out.println(accountList);

        for (Bank account : accountList) {
            if (account.getBalance() < 200) {
                account.deposit(100);
            } else if (account.getBalance() > 10000) {
                account.withdraw(300);
            }
        }
        System.out.println(accountList);
        System.out.println(acc4.equals(acc2));
        System.out.println(acc1.compareTo(acc3));
    }
}
