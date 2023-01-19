package ch11;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new CompleteCalculator();

        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.subtract(1, 2));
        System.out.println(calculator.multiply(1, 2));
        System.out.println(calculator.divide(1, 2));
        System.out.println(calculator.divide(1, 0));

        System.out.println(calculator.power(2, 3));

//        calculator.showInfo();
    }

}
