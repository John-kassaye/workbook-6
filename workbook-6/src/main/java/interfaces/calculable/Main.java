package interfaces.calculable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        List<Calculable> calculableList = new ArrayList<>();
        calculableList.add(new Adder(num1,num2));
        calculableList.add(new Multiplier(num1,num2));

        for (Calculable calculable : calculableList){
            System.out.println(calculable.calculate(num1,num2));

            // alternate way
            if (calculable instanceof Adder){
                Adder adder = (Adder) calculable ;
//                System.out.println("Adder: " + adder.calculate(num1,num2));
            }
            else if (calculable instanceof Multiplier Multiplier){
//                System.out.println("Multiplier: " + Multiplier.calculate(num1,num2));
            }
        }

        List<Calculator> calculatorList = new ArrayList<>();
        calculatorList.add(new Adder(num1,num2));
        calculatorList.add(new Multiplier(num1,num2));

        for (Calculator calculator : calculatorList){
            System.out.println(calculator.calculator(num1,num2));
        }

    }
}
