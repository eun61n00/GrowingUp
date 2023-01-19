package ch14;

public class Calculator implements Calc {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

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

//    @Override
//    public void description() {
//        System.out.println("This is overrided description() method.");
//    }

    public void showInfo() {
        System.out.println(this);
    }
}
