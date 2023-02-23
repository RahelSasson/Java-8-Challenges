//BS'D
/*
Add a copy constructor to the BankAccount class. This constructor should accept a
BankAccount object as an argument. It should assign to the balance field the value in the
argument’s balance field. As a result, the new object will be a copy of the argument object.
 */
public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }
    public BankAccount(double balance) {
        this.balance = balance;
    }
    //copy constructor
    public BankAccount(BankAccount account) {
        this.balance = account.balance;
    }
    public BankAccount(String balance) {
        this.balance = Double.parseDouble(balance);
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) {
        if(amount >= balance)
            this.balance -= amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setBalance(String balance) {
        this.balance = Double.parseDouble(balance);
    }
    public double getBalance() {
        return balance;
    }
}
