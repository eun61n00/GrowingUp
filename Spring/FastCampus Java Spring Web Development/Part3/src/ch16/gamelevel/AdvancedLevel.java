package ch16.gamelevel;

public class AdvancedLevel implements PlayerLevel {

    @Override
    public void run() {
        System.out.println("Run fast");
    }

    @Override
    public void jump() {
        System.out.println("Jump");
    }

    @Override
    public void turn() {
        System.out.println("Turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("\nThis is super level!");
    }
}
