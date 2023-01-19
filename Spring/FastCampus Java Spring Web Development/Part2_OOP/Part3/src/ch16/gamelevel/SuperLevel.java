package ch16.gamelevel;

public class SuperLevel implements PlayerLevel {

    @Override
    public void run() {
        System.out.println("Run very fast");
    }

    @Override
    public void jump() {
        System.out.println("Jump highly");
    }

    @Override
    public void turn() {
        System.out.println("Turn automatically");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("\nThis is super level!");
    }
}
