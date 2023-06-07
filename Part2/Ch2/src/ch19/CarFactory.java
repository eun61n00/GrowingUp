package ch19;

public class CarFactory {

    private static int serialNum = 10000;
    private static CarFactory instance = new CarFactory();

    private CarFactory() {}

    public Car createCar() {
        serialNum++;
        Car newCar = new Car(serialNum);
        return newCar;
    }

    public static CarFactory getInstance() {
        return instance;
    }


}
