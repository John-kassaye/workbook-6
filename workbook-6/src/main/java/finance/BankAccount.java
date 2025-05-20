package finance;

public class BankAccount implements Valuable {

    private String accountName;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountName, String accountNumber, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance+= amount;
    }

    public void withdraw(double amount){
        balance-= amount;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
