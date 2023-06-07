package ch10;

public class AICar extends Car {

    @Override
    public void drive() {
        System.out.println("AICar is driving on automatic mode.");
    }

    @Override
    public void stop() {
        System.out.println("AICar stops automatically.");
    }

    @Override
    public void wash() {
        System.out.println("AICar is washed automatically.");
    }
}
