package ch10;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void turnOn() {
        System.out.println("Car is turned on.");
    }

    public void turnOff() {
        System.out.println("Car is turned off.");
    }

    public void wash() {}

    public final void run() {
        turnOn();
        drive();
        stop();
        turnOff();
        wash();
    }

}
