package ch10;

public class ManualCar extends Car {
    @Override
    public void drive() {
        System.out.println("ManualCar is driving on manual mode.");
    }

    @Override
    public void stop() {
        System.out.println("ManualCar stops manually.");
    }
}
