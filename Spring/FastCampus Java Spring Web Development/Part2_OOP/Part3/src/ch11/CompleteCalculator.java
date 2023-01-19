package ch11;

public class CompleteCalculator extends Calculator{

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0)
            return Error;

        return num1 / num2;
    }

    public void showInfo() {
        System.out.println(this);
    }
}
