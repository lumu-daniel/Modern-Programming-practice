package lab4.prob4E;

public class CheckingAccount extends Account {
    private double balance;
    private double monthlyFee;
    private String accID;

    public CheckingAccount(String accID, double fee, int startBalance) {
        this.accID = accID;
        monthlyFee = fee;
        balance = startBalance;
    }

    @Override
    String getAccountID() {
        return this.accID;
    }

    @Override
    Double getBalance() {
        return this.balance;
    }

    @Override
    Double computeUpdatedBalance() {
        return this.getBalance() - monthlyFee;
    }
}
