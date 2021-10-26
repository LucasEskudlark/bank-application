package bankEntities;

public class Account {
    /* Private attributes */
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Account() {

    }

    /* Constructor with no initial deposit value */
    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    /* Constructor with initial deposit value */
    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    /* Deposit method.
    * Receive a new value and adds it to the account balance */
    public double deposit(double value) {
        return this.balance += value;
    }

    /* Withdrawal method
    * Receive a new value and subtracts it from the account balance*/
    public double withdrawal(double value) {
        return this.balance -= value;
    }

    /* toString Override to print account data(object) */
    @Override
    public String toString() {
        var s = "Account " + this.accountNumber + "," +
                " Holder: " + this.accountHolder + "," +
                " Balance: $" + this.balance;
        return s;
    }

    /* Getters and Setters */
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

}
