package interfaces.payable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Payable> payableList = new ArrayList<>();
        payableList.add(new HourlyEmployee(8,20.5));
        payableList.add(new Invoice(4,100));
        payableList.add(new Invoice(6,1000));
        payableList.add(new Freelance());

        print(payableList);

    }

    static void print(List<Payable> payableList){
        double total = 0;
        for (Payable payable : payableList) {
            if (payable instanceof Invoice invoice) {
                System.out.println("Invoice: " + invoice.getPaymentAmount());
                total+= invoice.getPaymentAmount();
            } else if (payable instanceof HourlyEmployee hourlyEmployee) {
                System.out.println("Employee:" + hourlyEmployee.getPaymentAmount());
                total+= hourlyEmployee.getPaymentAmount();
            } else {
                System.out.println(payable.getPaymentAmount());
            }
        }

        System.out.println("This is the total: " + total);
    }
}
