package ch16.gamelevel;

public class BeginnerLevel implements PlayerLevel {

    @Override
    public void run() {
        System.out.println("Run slowly");
    }

    @Override
    public void jump() {
        System.out.println("Cannot jump");
    }

    @Override
    public void turn() {
        System.out.println("Cannot turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("\nThis is beginner level!");
    }
}
