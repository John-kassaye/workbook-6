package finance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FinancialApplication {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Jota", "123456", 10000);
        Valuable bankAccount2 = new BankAccount("Alex", "098464", 2000);

        bankAccount.withdraw(100);
        bankAccount.deposit(10000);

//        System.out.println(bankAccount.getBalance());

        List<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(42);
        integers.add(14);
        integers.add(74);
        integers.add(34);

        Collections.sort(integers);
        System.out.println(integers);
    }
}