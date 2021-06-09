package Account;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main (String [] args){

        SavingsAccount save1 = new SavingsAccount(2000.00);
        SavingsAccount save2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(4);

        List<SavingsAccount> accountList = new ArrayList<>();

        accountList.add(save1);
        accountList.add(save2);

        accountList.forEach(savingsAccount -> {

            int i = 0;
            System.out.printf("Monthly interest: " + savingsAccount.calculateMonthlyInterest() +
                    "%n New Balance: " + savingsAccount.getSavingsBalance() + "%n");
            i++;

        });

        SavingsAccount.modifyInterestRate(5);

        accountList.forEach(savingsAccount -> {

            int i = 0;
            System.out.printf("Monthly interest for account: " + savingsAccount.calculateMonthlyInterest() +
                    "%n New Balance: " + savingsAccount.getSavingsBalance() + "%n");
            i++;

        });

    }
}
