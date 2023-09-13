public class Account {
    private static int accountTracker = 10001;
    private int accountNumber;
    private double accountBalance;

    Account(){
        accountNumber = accountTracker;
        accountTracker++;
        accountBalance = 0;
    }
    Account(double m){
        accountNumber = accountTracker;
        accountTracker++;
        accountBalance = m;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void withdraw(double x){
        accountBalance = getAccountBalance() - x;

    }

    public void deposit(double x){
        accountBalance = getAccountBalance() + x;
    }
}
