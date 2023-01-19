package ch11;
import java.lang.Math;

public abstract class Calculator implements Calc, Calc2 {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public double power(int num1, int num2) {
        return Math.pow(num1, num2);
    }
}
