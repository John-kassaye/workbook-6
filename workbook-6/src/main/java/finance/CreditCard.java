package finance;

public class CreditCard implements Valuable{
    private String accountName;
    private String accountNumber;
    private double balance;

    public CreditCard(String accountName, String accountNumber, double balance) {
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

    public void charge(double amount){

    }

    public void pay(double amount) {

    }

        @Override
    public double getValue() {
        return 0;
    }
}
