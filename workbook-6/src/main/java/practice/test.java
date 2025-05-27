package practice;

import java.nio.DoubleBuffer;
import java.util.function.DoubleBinaryOperator;

public class test {
    public static void main(String[] args) {

        DoubleBinaryOperator dbo = (a,b) -> a * b;
        System.out.println(dbo.applyAsDouble(3,5));
    }
}
