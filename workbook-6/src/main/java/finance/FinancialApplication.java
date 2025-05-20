package finance;

public class FinancialApplication {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Jota","123456",10000);
        Valuable bankAccount2 = new BankAccount("Alex","098464",2000);

        bankAccount.withdraw(100);
        bankAccount.deposit(10000);

        System.out.println(bankAccount.getBalance());
    }
}
