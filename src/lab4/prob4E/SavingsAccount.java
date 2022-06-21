package lab4.prob4E;

public class SavingsAccount extends Account {
    private double balance;
    private double interestRate;
    public String accID;

    public SavingsAccount(String accID, double interestRate, int balance) {
        this.accID = accID;
        this.interestRate = interestRate;
        this.balance = balance;
    }

    @Override
    String getAccountID() {
        return accID;
    }

    @Override
    Double getBalance() {
        return balance;
    }

    @Override
    Double computeUpdatedBalance() {
        return this.getBalance() + (interestRate * balance);
    }
}
