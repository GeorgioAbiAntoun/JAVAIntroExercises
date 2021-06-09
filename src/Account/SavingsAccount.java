package Account;

public class SavingsAccount {

    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance){

        this.savingsBalance = savingsBalance;

    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest(){

        double toReturn = (this.savingsBalance * annualInterestRate)/12;
        this.savingsBalance = this.savingsBalance + this.savingsBalance * (annualInterestRate/12) ;
        return toReturn;

    }

    public static void modifyInterestRate(double newAnnualInterestRate){

        annualInterestRate = newAnnualInterestRate;

    }
}
