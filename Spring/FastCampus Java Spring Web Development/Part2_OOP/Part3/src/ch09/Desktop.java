package ch09;

public class Desktop extends Computer {

    @Override
    public void display() {
        System.out.println("Desktop displays");
    }

    @Override
    public void typing() {
        System.out.println("Desktop types");
    }

    @Override
    public void turnOn() {
        System.out.println("Desktop is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Desktop is turned off");
    }

}
