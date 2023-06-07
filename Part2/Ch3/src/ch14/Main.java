package ch14;

public class Main {

    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 5;

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(num1, num2));
        System.out.println(calculator.subtract(num1, num2));
        System.out.println(calculator.multiply(num1, num2));
        System.out.println(calculator.divide(num1, num2));

        calculator.description();

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Calc.total(arr));
    }

}
