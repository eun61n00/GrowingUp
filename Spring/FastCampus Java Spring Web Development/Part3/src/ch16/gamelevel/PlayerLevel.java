package ch16.gamelevel;

public interface PlayerLevel {

    void run();
    void jump();
    void turn();
    void showLevelMessage();

    default void go(int count) {
        int i = count;
        showLevelMessage();
        run();
        while (i-- > 0) {
            jump();
        }
        turn();
    }

}
