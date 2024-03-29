package StatePattern_Lab1;

public class Account {
    private AccountState accountState;
    private double balance;
    private String accountNumber;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState(this);
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }
    public void deposit(double amount) {
        accountState.deposit(amount);
    }

    public void withdraw(double amount) {
        accountState.withdraw(amount);
    }

    public void suspend() {
        accountState.suspend(this);
    }

    public void activate() {
        accountState.activate(this);
    }

    public void close() {
        accountState.close(this);
    }

    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }
}
