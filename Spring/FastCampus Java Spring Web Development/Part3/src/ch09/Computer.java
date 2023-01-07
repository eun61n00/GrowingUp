package ch09;

public abstract class Computer {

    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("Turned on");
    }

    public void turnOff() {
        System.out.println("Turned off");
    }

}
