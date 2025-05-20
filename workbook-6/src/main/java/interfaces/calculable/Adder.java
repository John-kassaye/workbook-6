package interfaces.calculable;

public class Adder extends Calculator implements Calculable{
    public Adder(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public int calculator(int a, int b) {
        return a + b;
    }

    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
