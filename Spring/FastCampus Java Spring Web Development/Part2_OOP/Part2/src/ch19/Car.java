package ch19;

public class Car {


    public Car(int serialNum) {
        this.carNum = serialNum;
    }

    private int carNum;

    public int getCarNum() {
        return carNum;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carNum=" + carNum +
                '}';
    }
}
